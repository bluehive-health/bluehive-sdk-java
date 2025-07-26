// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.client

import com.bluehive.api.core.ClientOptions
import com.bluehive.api.core.getPackageVersion
import com.bluehive.api.services.blocking.DatabaseService
import com.bluehive.api.services.blocking.DatabaseServiceImpl
import com.bluehive.api.services.blocking.FaxService
import com.bluehive.api.services.blocking.FaxServiceImpl
import com.bluehive.api.services.blocking.HealthService
import com.bluehive.api.services.blocking.HealthServiceImpl
import com.bluehive.api.services.blocking.ProviderService
import com.bluehive.api.services.blocking.ProviderServiceImpl
import com.bluehive.api.services.blocking.VersionService
import com.bluehive.api.services.blocking.VersionServiceImpl
import java.util.function.Consumer

class BlueHiveClientImpl(private val clientOptions: ClientOptions) : BlueHiveClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BlueHiveClientAsync by lazy { BlueHiveClientAsyncImpl(clientOptions) }

    private val withRawResponse: BlueHiveClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val health: HealthService by lazy { HealthServiceImpl(clientOptionsWithUserAgent) }

    private val version: VersionService by lazy { VersionServiceImpl(clientOptionsWithUserAgent) }

    private val providers: ProviderService by lazy {
        ProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val database: DatabaseService by lazy {
        DatabaseServiceImpl(clientOptionsWithUserAgent)
    }

    private val fax: FaxService by lazy { FaxServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BlueHiveClientAsync = async

    override fun withRawResponse(): BlueHiveClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlueHiveClient =
        BlueHiveClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun health(): HealthService = health

    override fun version(): VersionService = version

    override fun providers(): ProviderService = providers

    override fun database(): DatabaseService = database

    override fun fax(): FaxService = fax

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlueHiveClient.WithRawResponse {

        private val health: HealthService.WithRawResponse by lazy {
            HealthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val version: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderService.WithRawResponse by lazy {
            ProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val database: DatabaseService.WithRawResponse by lazy {
            DatabaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fax: FaxService.WithRawResponse by lazy {
            FaxServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlueHiveClient.WithRawResponse =
            BlueHiveClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun health(): HealthService.WithRawResponse = health

        override fun version(): VersionService.WithRawResponse = version

        override fun providers(): ProviderService.WithRawResponse = providers

        override fun database(): DatabaseService.WithRawResponse = database

        override fun fax(): FaxService.WithRawResponse = fax
    }
}
