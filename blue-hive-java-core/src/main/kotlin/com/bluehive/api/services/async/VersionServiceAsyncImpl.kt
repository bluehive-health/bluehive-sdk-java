// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.handlers.errorBodyHandler
import com.bluehive.api.core.handlers.errorHandler
import com.bluehive.api.core.handlers.jsonHandler
import com.bluehive.api.core.http.HttpMethod
import com.bluehive.api.core.http.HttpRequest
import com.bluehive.api.core.http.HttpResponse
import com.bluehive.api.core.http.HttpResponse.Handler
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.core.http.parseable
import com.bluehive.api.core.prepareAsync
import com.bluehive.api.models.version.VersionRetrieveParams
import com.bluehive.api.models.version.VersionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class VersionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VersionServiceAsync {

    private val withRawResponse: VersionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VersionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync =
        VersionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: VersionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionRetrieveResponse> =
        // get /v1/version
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VersionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse =
            VersionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<VersionRetrieveResponse> =
            jsonHandler<VersionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VersionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "version")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
