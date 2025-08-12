// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClientAsync
import com.bluehive.api.models.providers.ProviderLookupParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProviderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun lookup() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val providerServiceAsync = client.providers()

        val responseFuture =
            providerServiceAsync.lookup(
                ProviderLookupParams.builder()
                    .firstname("firstname")
                    .lastname("lastname")
                    .npi("npi")
                    .zipcode("zipcode")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
