// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.client

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.services.async.DatabaseServiceAsync
import com.bluehive.api.services.async.FaxServiceAsync
import com.bluehive.api.services.async.HealthServiceAsync
import com.bluehive.api.services.async.ProviderServiceAsync
import com.bluehive.api.services.async.VersionServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the BlueHive REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface BlueHiveClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): BlueHiveClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlueHiveClientAsync

    fun health(): HealthServiceAsync

    fun version(): VersionServiceAsync

    fun providers(): ProviderServiceAsync

    fun database(): DatabaseServiceAsync

    fun fax(): FaxServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [BlueHiveClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlueHiveClientAsync.WithRawResponse

        fun health(): HealthServiceAsync.WithRawResponse

        fun version(): VersionServiceAsync.WithRawResponse

        fun providers(): ProviderServiceAsync.WithRawResponse

        fun database(): DatabaseServiceAsync.WithRawResponse

        fun fax(): FaxServiceAsync.WithRawResponse
    }
}
