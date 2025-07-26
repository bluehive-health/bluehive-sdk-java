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
import com.bluehive.api.models.database.DatabaseCheckHealthParams
import com.bluehive.api.models.database.DatabaseCheckHealthResponse
import java.util.function.Consumer

class DatabaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatabaseService {

    private val withRawResponse: DatabaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatabaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseService =
        DatabaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun checkHealth(
        params: DatabaseCheckHealthParams,
        requestOptions: RequestOptions,
    ): DatabaseCheckHealthResponse =
        // get /v1/database/health
        withRawResponse().checkHealth(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatabaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatabaseService.WithRawResponse =
            DatabaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val checkHealthHandler: Handler<DatabaseCheckHealthResponse> =
            jsonHandler<DatabaseCheckHealthResponse>(clientOptions.jsonMapper)

        override fun checkHealth(
            params: DatabaseCheckHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatabaseCheckHealthResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "database", "health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
