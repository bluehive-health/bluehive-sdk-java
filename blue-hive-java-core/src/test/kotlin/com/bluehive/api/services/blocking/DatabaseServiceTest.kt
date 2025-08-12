// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatabaseServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun checkHealth() {
        val client =
            BlueHiveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val databaseService = client.database()

        val response = databaseService.checkHealth()

        response.validate()
    }
}
