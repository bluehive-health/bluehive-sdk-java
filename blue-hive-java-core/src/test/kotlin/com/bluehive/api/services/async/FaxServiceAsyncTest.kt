// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.services.async

import com.bluehive.api.TestServerExtension
import com.bluehive.api.client.okhttp.BlueHiveOkHttpClientAsync
import com.bluehive.api.models.fax.FaxSendParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FaxServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun listProviders() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.fax()

        val responseFuture = faxServiceAsync.listProviders()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieveStatus() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.fax()

        val responseFuture = faxServiceAsync.retrieveStatus("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun send() {
        val client =
            BlueHiveOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxServiceAsync = client.fax()

        val responseFuture =
            faxServiceAsync.send(
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

        val response = responseFuture.get()
        response.validate()
    }
}
