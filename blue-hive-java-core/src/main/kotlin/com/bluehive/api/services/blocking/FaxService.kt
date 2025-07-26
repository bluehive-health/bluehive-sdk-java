// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.fax.FaxListProvidersParams
import com.bluehive.api.models.fax.FaxListProvidersResponse
import com.bluehive.api.models.fax.FaxRetrieveStatusParams
import com.bluehive.api.models.fax.FaxRetrieveStatusResponse
import com.bluehive.api.models.fax.FaxSendParams
import com.bluehive.api.models.fax.FaxSendResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface FaxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService

    /** Get a list of available fax providers and their configuration status. */
    fun listProviders(): FaxListProvidersResponse = listProviders(FaxListProvidersParams.none())

    /** @see listProviders */
    fun listProviders(
        params: FaxListProvidersParams = FaxListProvidersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxListProvidersResponse

    /** @see listProviders */
    fun listProviders(
        params: FaxListProvidersParams = FaxListProvidersParams.none()
    ): FaxListProvidersResponse = listProviders(params, RequestOptions.none())

    /** @see listProviders */
    fun listProviders(requestOptions: RequestOptions): FaxListProvidersResponse =
        listProviders(FaxListProvidersParams.none(), requestOptions)

    /** Retrieve the current status and details of a fax by its ID. */
    fun retrieveStatus(id: String): FaxRetrieveStatusResponse =
        retrieveStatus(id, FaxRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxRetrieveStatusResponse = retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
    ): FaxRetrieveStatusResponse = retrieveStatus(id, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: FaxRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxRetrieveStatusResponse

    /** @see retrieveStatus */
    fun retrieveStatus(params: FaxRetrieveStatusParams): FaxRetrieveStatusResponse =
        retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(id: String, requestOptions: RequestOptions): FaxRetrieveStatusResponse =
        retrieveStatus(id, FaxRetrieveStatusParams.none(), requestOptions)

    /** Send a fax document to a specified number using the configured fax provider. */
    fun send(params: FaxSendParams): FaxSendResponse = send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: FaxSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FaxSendResponse

    /** A view of [FaxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/fax/providers`, but is otherwise the same as
         * [FaxService.listProviders].
         */
        @MustBeClosed
        fun listProviders(): HttpResponseFor<FaxListProvidersResponse> =
            listProviders(FaxListProvidersParams.none())

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            params: FaxListProvidersParams = FaxListProvidersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxListProvidersResponse>

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            params: FaxListProvidersParams = FaxListProvidersParams.none()
        ): HttpResponseFor<FaxListProvidersResponse> = listProviders(params, RequestOptions.none())

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            requestOptions: RequestOptions
        ): HttpResponseFor<FaxListProvidersResponse> =
            listProviders(FaxListProvidersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/fax/status/{id}`, but is otherwise the same as
         * [FaxService.retrieveStatus].
         */
        @MustBeClosed
        fun retrieveStatus(id: String): HttpResponseFor<FaxRetrieveStatusResponse> =
            retrieveStatus(id, FaxRetrieveStatusParams.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxRetrieveStatusResponse> =
            retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
        ): HttpResponseFor<FaxRetrieveStatusResponse> =
            retrieveStatus(id, params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: FaxRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxRetrieveStatusResponse>

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            params: FaxRetrieveStatusParams
        ): HttpResponseFor<FaxRetrieveStatusResponse> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        @MustBeClosed
        fun retrieveStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FaxRetrieveStatusResponse> =
            retrieveStatus(id, FaxRetrieveStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/fax/send`, but is otherwise the same as
         * [FaxService.send].
         */
        @MustBeClosed
        fun send(params: FaxSendParams): HttpResponseFor<FaxSendResponse> =
            send(params, RequestOptions.none())

        /** @see send */
        @MustBeClosed
        fun send(
            params: FaxSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FaxSendResponse>
    }
}
