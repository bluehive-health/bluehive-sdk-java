// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.providers.ProviderLookupParams
import com.bluehive.api.models.providers.ProviderLookupResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderServiceAsync

    /** Search for healthcare providers by NPI number, name, or location proximity. */
    fun lookup(): CompletableFuture<ProviderLookupResponse> = lookup(ProviderLookupParams.none())

    /** @see lookup */
    fun lookup(
        params: ProviderLookupParams = ProviderLookupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProviderLookupResponse>

    /** @see lookup */
    fun lookup(
        params: ProviderLookupParams = ProviderLookupParams.none()
    ): CompletableFuture<ProviderLookupResponse> = lookup(params, RequestOptions.none())

    /** @see lookup */
    fun lookup(requestOptions: RequestOptions): CompletableFuture<ProviderLookupResponse> =
        lookup(ProviderLookupParams.none(), requestOptions)

    /**
     * A view of [ProviderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProviderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/providers/lookup`, but is otherwise the same as
         * [ProviderServiceAsync.lookup].
         */
        fun lookup(): CompletableFuture<HttpResponseFor<ProviderLookupResponse>> =
            lookup(ProviderLookupParams.none())

        /** @see lookup */
        fun lookup(
            params: ProviderLookupParams = ProviderLookupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProviderLookupResponse>>

        /** @see lookup */
        fun lookup(
            params: ProviderLookupParams = ProviderLookupParams.none()
        ): CompletableFuture<HttpResponseFor<ProviderLookupResponse>> =
            lookup(params, RequestOptions.none())

        /** @see lookup */
        fun lookup(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProviderLookupResponse>> =
            lookup(ProviderLookupParams.none(), requestOptions)
    }
}
