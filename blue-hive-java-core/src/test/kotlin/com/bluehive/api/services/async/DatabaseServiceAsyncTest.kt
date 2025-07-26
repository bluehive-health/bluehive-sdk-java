// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatabaseServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun checkHealth() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val databaseServiceAsync = client.database()

        val responseFuture = databaseServiceAsync.checkHealth()

        val response = responseFuture.get()
        response.validate()
    }
}
