// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.database.DatabaseCheckHealthParams
import com.bluehive.api.models.database.DatabaseCheckHealthResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DatabaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseServiceAsync

    /** Check MongoDB database connectivity and retrieve health statistics. */
    fun checkHealth(): CompletableFuture<DatabaseCheckHealthResponse> =
        checkHealth(DatabaseCheckHealthParams.none())

    /** @see checkHealth */
    fun checkHealth(
        params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DatabaseCheckHealthResponse>

    /** @see checkHealth */
    fun checkHealth(
        params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none()
    ): CompletableFuture<DatabaseCheckHealthResponse> = checkHealth(params, RequestOptions.none())

    /** @see checkHealth */
    fun checkHealth(
        requestOptions: RequestOptions
    ): CompletableFuture<DatabaseCheckHealthResponse> =
        checkHealth(DatabaseCheckHealthParams.none(), requestOptions)

    /**
     * A view of [DatabaseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatabaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/database/health`, but is otherwise the same as
         * [DatabaseServiceAsync.checkHealth].
         */
        fun checkHealth(): CompletableFuture<HttpResponseFor<DatabaseCheckHealthResponse>> =
            checkHealth(DatabaseCheckHealthParams.none())

        /** @see checkHealth */
        fun checkHealth(
            params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DatabaseCheckHealthResponse>>

        /** @see checkHealth */
        fun checkHealth(
            params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none()
        ): CompletableFuture<HttpResponseFor<DatabaseCheckHealthResponse>> =
            checkHealth(params, RequestOptions.none())

        /** @see checkHealth */
        fun checkHealth(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DatabaseCheckHealthResponse>> =
            checkHealth(DatabaseCheckHealthParams.none(), requestOptions)
    }
}
