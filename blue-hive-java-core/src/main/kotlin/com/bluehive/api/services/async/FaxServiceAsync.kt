// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.fax.FaxListProvidersParams
import com.bluehive.api.models.fax.FaxListProvidersResponse
import com.bluehive.api.models.fax.FaxRetrieveStatusParams
import com.bluehive.api.models.fax.FaxRetrieveStatusResponse
import com.bluehive.api.models.fax.FaxSendParams
import com.bluehive.api.models.fax.FaxSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FaxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxServiceAsync

    /** Get a list of available fax providers and their configuration status. */
    fun listProviders(): CompletableFuture<FaxListProvidersResponse> =
        listProviders(FaxListProvidersParams.none())

    /** @see listProviders */
    fun listProviders(
        params: FaxListProvidersParams = FaxListProvidersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxListProvidersResponse>

    /** @see listProviders */
    fun listProviders(
        params: FaxListProvidersParams = FaxListProvidersParams.none()
    ): CompletableFuture<FaxListProvidersResponse> = listProviders(params, RequestOptions.none())

    /** @see listProviders */
    fun listProviders(requestOptions: RequestOptions): CompletableFuture<FaxListProvidersResponse> =
        listProviders(FaxListProvidersParams.none(), requestOptions)

    /** Retrieve the current status and details of a fax by its ID. */
    fun retrieveStatus(id: String): CompletableFuture<FaxRetrieveStatusResponse> =
        retrieveStatus(id, FaxRetrieveStatusParams.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxRetrieveStatusResponse> =
        retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
    ): CompletableFuture<FaxRetrieveStatusResponse> =
        retrieveStatus(id, params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: FaxRetrieveStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxRetrieveStatusResponse>

    /** @see retrieveStatus */
    fun retrieveStatus(
        params: FaxRetrieveStatusParams
    ): CompletableFuture<FaxRetrieveStatusResponse> = retrieveStatus(params, RequestOptions.none())

    /** @see retrieveStatus */
    fun retrieveStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxRetrieveStatusResponse> =
        retrieveStatus(id, FaxRetrieveStatusParams.none(), requestOptions)

    /** Send a fax document to a specified number using the configured fax provider. */
    fun send(params: FaxSendParams): CompletableFuture<FaxSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: FaxSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FaxSendResponse>

    /** A view of [FaxServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/fax/providers`, but is otherwise the same as
         * [FaxServiceAsync.listProviders].
         */
        fun listProviders(): CompletableFuture<HttpResponseFor<FaxListProvidersResponse>> =
            listProviders(FaxListProvidersParams.none())

        /** @see listProviders */
        fun listProviders(
            params: FaxListProvidersParams = FaxListProvidersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxListProvidersResponse>>

        /** @see listProviders */
        fun listProviders(
            params: FaxListProvidersParams = FaxListProvidersParams.none()
        ): CompletableFuture<HttpResponseFor<FaxListProvidersResponse>> =
            listProviders(params, RequestOptions.none())

        /** @see listProviders */
        fun listProviders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FaxListProvidersResponse>> =
            listProviders(FaxListProvidersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/fax/status/{id}`, but is otherwise the same as
         * [FaxServiceAsync.retrieveStatus].
         */
        fun retrieveStatus(
            id: String
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>> =
            retrieveStatus(id, FaxRetrieveStatusParams.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>> =
            retrieveStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            params: FaxRetrieveStatusParams = FaxRetrieveStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>> =
            retrieveStatus(id, params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: FaxRetrieveStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>>

        /** @see retrieveStatus */
        fun retrieveStatus(
            params: FaxRetrieveStatusParams
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>> =
            retrieveStatus(params, RequestOptions.none())

        /** @see retrieveStatus */
        fun retrieveStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxRetrieveStatusResponse>> =
            retrieveStatus(id, FaxRetrieveStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/fax/send`, but is otherwise the same as
         * [FaxServiceAsync.send].
         */
        fun send(params: FaxSendParams): CompletableFuture<HttpResponseFor<FaxSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: FaxSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FaxSendResponse>>
    }
}
