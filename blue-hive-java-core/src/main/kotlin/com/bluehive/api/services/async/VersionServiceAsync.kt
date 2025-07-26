// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.version.VersionRetrieveParams
import com.bluehive.api.models.version.VersionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionServiceAsync

    /** Retrieve the current version of the BlueHive API. */
    fun retrieve(): CompletableFuture<VersionRetrieveResponse> =
        retrieve(VersionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: VersionRetrieveParams = VersionRetrieveParams.none()
    ): CompletableFuture<VersionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<VersionRetrieveResponse> =
        retrieve(VersionRetrieveParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/version`, but is otherwise the same as
         * [VersionServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(VersionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VersionRetrieveParams = VersionRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VersionRetrieveResponse>> =
            retrieve(VersionRetrieveParams.none(), requestOptions)
    }
}
