// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.RequestOptions
import com.bluehive.api.core.http.HttpResponseFor
import com.bluehive.api.models.providers.ProviderLookupParams
import com.bluehive.api.models.providers.ProviderLookupResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService

    /** Search for healthcare providers by NPI number, name, or location proximity. */
    fun lookup(): ProviderLookupResponse = lookup(ProviderLookupParams.none())

    /** @see lookup */
    fun lookup(
        params: ProviderLookupParams = ProviderLookupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProviderLookupResponse

    /** @see lookup */
    fun lookup(params: ProviderLookupParams = ProviderLookupParams.none()): ProviderLookupResponse =
        lookup(params, RequestOptions.none())

    /** @see lookup */
    fun lookup(requestOptions: RequestOptions): ProviderLookupResponse =
        lookup(ProviderLookupParams.none(), requestOptions)

    /** A view of [ProviderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/providers/lookup`, but is otherwise the same as
         * [ProviderService.lookup].
         */
        @MustBeClosed
        fun lookup(): HttpResponseFor<ProviderLookupResponse> = lookup(ProviderLookupParams.none())

        /** @see lookup */
        @MustBeClosed
        fun lookup(
            params: ProviderLookupParams = ProviderLookupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProviderLookupResponse>

        /** @see lookup */
        @MustBeClosed
        fun lookup(
            params: ProviderLookupParams = ProviderLookupParams.none()
        ): HttpResponseFor<ProviderLookupResponse> = lookup(params, RequestOptions.none())

        /** @see lookup */
        @MustBeClosed
        fun lookup(requestOptions: RequestOptions): HttpResponseFor<ProviderLookupResponse> =
            lookup(ProviderLookupParams.none(), requestOptions)
    }
}
