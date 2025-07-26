// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.client

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.getPackageVersion
import com.bluehive.api.services.async.DatabaseServiceAsync
import com.bluehive.api.services.async.DatabaseServiceAsyncImpl
import com.bluehive.api.services.async.FaxServiceAsync
import com.bluehive.api.services.async.FaxServiceAsyncImpl
import com.bluehive.api.services.async.HealthServiceAsync
import com.bluehive.api.services.async.HealthServiceAsyncImpl
import com.bluehive.api.services.async.ProviderServiceAsync
import com.bluehive.api.services.async.ProviderServiceAsyncImpl
import com.bluehive.api.services.async.VersionServiceAsync
import com.bluehive.api.services.async.VersionServiceAsyncImpl
import java.util.function.Consumer

class BlueHiveClientAsyncImpl(private val clientOptions: ClientOptions) : BlueHiveClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BlueHiveClient by lazy { BlueHiveClientImpl(clientOptions) }

    private val withRawResponse: BlueHiveClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthServiceAsync by lazy {
        HealthServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val version: VersionServiceAsync by lazy {
        VersionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val database: DatabaseServiceAsync by lazy {
        DatabaseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val fax: FaxServiceAsync by lazy { FaxServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): BlueHiveClient = sync

    override fun withRawResponse(): BlueHiveClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlueHiveClientAsync =
        BlueHiveClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthServiceAsync = health

    override fun version(): VersionServiceAsync = version

    override fun providers(): ProviderServiceAsync = providers

    override fun database(): DatabaseServiceAsync = database

    override fun fax(): FaxServiceAsync = fax

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlueHiveClientAsync.WithRawResponse {

        private val health: HealthServiceAsync.WithRawResponse by lazy {
            HealthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderServiceAsync.WithRawResponse by lazy {
            ProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val database: DatabaseServiceAsync.WithRawResponse by lazy {
            DatabaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fax: FaxServiceAsync.WithRawResponse by lazy {
            FaxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlueHiveClientAsync.WithRawResponse =
            BlueHiveClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthServiceAsync.WithRawResponse = health

        override fun version(): VersionServiceAsync.WithRawResponse = version

        override fun providers(): ProviderServiceAsync.WithRawResponse = providers

        override fun database(): DatabaseServiceAsync.WithRawResponse = database

        override fun fax(): FaxServiceAsync.WithRawResponse = fax
    }
}
