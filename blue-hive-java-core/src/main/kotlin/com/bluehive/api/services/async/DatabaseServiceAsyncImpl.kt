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
import com.bluehive.api.models.database.DatabaseCheckHealthParams
import com.bluehive.api.models.database.DatabaseCheckHealthResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DatabaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatabaseServiceAsync {

    private val withRawResponse: DatabaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatabaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseServiceAsync =
        DatabaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkHealth(
        params: DatabaseCheckHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DatabaseCheckHealthResponse> =
        // get /v1/database/health
        withRawResponse().checkHealth(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatabaseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatabaseServiceAsync.WithRawResponse =
            DatabaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHealthHandler: Handler<DatabaseCheckHealthResponse> =
            jsonHandler<DatabaseCheckHealthResponse>(clientOptions.jsonMapper)

        override fun checkHealth(
            params: DatabaseCheckHealthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DatabaseCheckHealthResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "database", "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { checkHealthHandler.handle(it) }
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
