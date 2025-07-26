// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

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
import com.bluehive.api.core.prepare
import com.bluehive.api.models.providers.ProviderLookupParams
import com.bluehive.api.models.providers.ProviderLookupResponse
import java.util.function.Consumer

class ProviderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProviderService {

    private val withRawResponse: ProviderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProviderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService =
        ProviderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookup(
        params: ProviderLookupParams,
        requestOptions: RequestOptions,
    ): ProviderLookupResponse =
        // get /v1/providers/lookup
        withRawResponse().lookup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProviderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProviderService.WithRawResponse =
            ProviderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val lookupHandler: Handler<ProviderLookupResponse> =
            jsonHandler<ProviderLookupResponse>(clientOptions.jsonMapper)

        override fun lookup(
            params: ProviderLookupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProviderLookupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "providers", "lookup")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { lookupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
