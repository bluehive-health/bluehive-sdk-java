// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.checkRequired
import com.bluehive.api.core.handlers.errorBodyHandler
import com.bluehive.api.core.handlers.errorHandler
import com.bluehive.api.core.handlers.jsonHandler
import com.bluehive.api.core.http.HttpMethod
import com.bluehive.api.core.http.HttpRequest
import com.bluehive.api.core.http.HttpResponse
import com.bluehive.api.core.http.HttpResponse.Handler
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.core.http.json
import com.bluehive.api.core.http.parseable
import com.bluehive.api.core.prepare
import com.bluehive.api.models.fax.FaxListProvidersParams
import com.bluehive.api.models.fax.FaxListProvidersResponse
import com.bluehive.api.models.fax.FaxRetrieveStatusParams
import com.bluehive.api.models.fax.FaxRetrieveStatusResponse
import com.bluehive.api.models.fax.FaxSendParams
import com.bluehive.api.models.fax.FaxSendResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FaxServiceImpl internal constructor(private val clientOptions: ClientOptions) : FaxService {

    private val withRawResponse: FaxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FaxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService =
        FaxServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listProviders(
        params: FaxListProvidersParams,
        requestOptions: RequestOptions,
    ): FaxListProvidersResponse =
        // get /v1/fax/providers
        withRawResponse().listProviders(params, requestOptions).parse()

    override fun retrieveStatus(
        params: FaxRetrieveStatusParams,
        requestOptions: RequestOptions,
    ): FaxRetrieveStatusResponse =
        // get /v1/fax/status/{id}
        withRawResponse().retrieveStatus(params, requestOptions).parse()

    override fun send(params: FaxSendParams, requestOptions: RequestOptions): FaxSendResponse =
        // post /v1/fax/send
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FaxService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxService.WithRawResponse =
            FaxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listProvidersHandler: Handler<FaxListProvidersResponse> =
            jsonHandler<FaxListProvidersResponse>(clientOptions.jsonMapper)

        override fun listProviders(
            params: FaxListProvidersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxListProvidersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "fax", "providers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listProvidersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveStatusHandler: Handler<FaxRetrieveStatusResponse> =
            jsonHandler<FaxRetrieveStatusResponse>(clientOptions.jsonMapper)

        override fun retrieveStatus(
            params: FaxRetrieveStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxRetrieveStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "fax", "status", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendHandler: Handler<FaxSendResponse> =
            jsonHandler<FaxSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: FaxSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxSendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "fax", "send")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { sendHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
