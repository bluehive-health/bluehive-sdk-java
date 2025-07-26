// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.database.DatabaseCheckHealthParams
import com.bluehive.api.models.database.DatabaseCheckHealthResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface DatabaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseService

    /** Check MongoDB database connectivity and retrieve health statistics. */
    fun checkHealth(): DatabaseCheckHealthResponse = checkHealth(DatabaseCheckHealthParams.none())

    /** @see checkHealth */
    fun checkHealth(
        params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatabaseCheckHealthResponse

    /** @see checkHealth */
    fun checkHealth(
        params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none()
    ): DatabaseCheckHealthResponse = checkHealth(params, RequestOptions.none())

    /** @see checkHealth */
    fun checkHealth(requestOptions: RequestOptions): DatabaseCheckHealthResponse =
        checkHealth(DatabaseCheckHealthParams.none(), requestOptions)

    /** A view of [DatabaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/database/health`, but is otherwise the same as
         * [DatabaseService.checkHealth].
         */
        @MustBeClosed
        fun checkHealth(): HttpResponseFor<DatabaseCheckHealthResponse> =
            checkHealth(DatabaseCheckHealthParams.none())

        /** @see checkHealth */
        @MustBeClosed
        fun checkHealth(
            params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatabaseCheckHealthResponse>

        /** @see checkHealth */
        @MustBeClosed
        fun checkHealth(
            params: DatabaseCheckHealthParams = DatabaseCheckHealthParams.none()
        ): HttpResponseFor<DatabaseCheckHealthResponse> = checkHealth(params, RequestOptions.none())

        /** @see checkHealth */
        @MustBeClosed
        fun checkHealth(
            requestOptions: RequestOptions
        ): HttpResponseFor<DatabaseCheckHealthResponse> =
            checkHealth(DatabaseCheckHealthParams.none(), requestOptions)
    }
}
