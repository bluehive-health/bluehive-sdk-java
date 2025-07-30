// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxSendParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.document())
            .isEqualTo(
                FaxSendParams.Document.builder()
                    .content("content")
                    .contentType(FaxSendParams.Document.ContentType.APPLICATION_PDF)
                    .filename("filename")
                    .build()
            )
        assertThat(body.to()).isEqualTo("to")
        assertThat(body.from()).contains("from")
        assertThat(body.provider()).contains("provider")
        assertThat(body.subject()).contains("subject")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FaxSendParams.builder()
                .document(
                    FaxSendParams.Document.builder()
                        .content("content")
                        .contentType(FaxSendParams.Document.ContentType.APPLICATION_PDF)
                        .build()
                )
                .to("to")
                .build()

        val body = params._body()

        assertThat(body.document())
            .isEqualTo(
                FaxSendParams.Document.builder()
                    .content("content")
                    .contentType(FaxSendParams.Document.ContentType.APPLICATION_PDF)
                    .build()
            )
        assertThat(body.to()).isEqualTo("to")
    }
}
