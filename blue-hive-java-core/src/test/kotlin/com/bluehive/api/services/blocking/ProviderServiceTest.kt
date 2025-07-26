// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClient
import com.bluehive.api.models.providers.ProviderLookupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProviderServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun lookup() {
        val client =
            BlueHiveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val providerService = client.providers()

        val response =
            providerService.lookup(
                ProviderLookupParams.builder()
                    .firstname("firstname")
                    .lastname("lastname")
                    .npi("npi")
                    .zipcode("zipcode")
                    .build()
            )

        response.validate()
    }
}
