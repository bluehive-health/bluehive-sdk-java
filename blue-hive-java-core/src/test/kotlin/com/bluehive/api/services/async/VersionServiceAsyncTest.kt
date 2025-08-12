// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VersionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val versionServiceAsync = client.version()

        val versionFuture = versionServiceAsync.retrieve()

        val version = versionFuture.get()
        version.validate()
    }
}
