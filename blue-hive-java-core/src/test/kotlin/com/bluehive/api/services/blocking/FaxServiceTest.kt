// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.blocking

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClient
import com.bluehive.api.models.fax.FaxSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FaxServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listProviders() {
        val client =
            BlueHiveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.fax()

        val response = faxService.listProviders()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveStatus() {
        val client =
            BlueHiveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.fax()

        val response = faxService.retrieveStatus("id")

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun send() {
        val client =
            BlueHiveOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxService = client.fax()

        val response =
            faxService.send(
                FaxSendParams.builder()
                    .document(
                        FaxSendParams.Document.builder()
                            .content("content")
                            .contentType(FaxSendParams.Document.ContentType.APPLICATION_PDF)
                            .filename("filename")
                            .build()
                    )
                    .to("to")
                    .from("from")
                    .provider("provider")
                    .subject("subject")
                    .build()
            )

        response.validate()
    }
}
