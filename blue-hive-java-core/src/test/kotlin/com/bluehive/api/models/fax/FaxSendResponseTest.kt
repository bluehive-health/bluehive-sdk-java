// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxSendResponseTest {

    @Test
    fun create() {
        val faxSendResponse =
            FaxSendResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .from("from")
                .provider("provider")
                .status(FaxSendResponse.Status.QUEUED)
                .to("to")
                .estimatedDelivery("estimatedDelivery")
                .build()

        assertThat(faxSendResponse.id()).isEqualTo("id")
        assertThat(faxSendResponse.createdAt()).isEqualTo("createdAt")
        assertThat(faxSendResponse.from()).isEqualTo("from")
        assertThat(faxSendResponse.provider()).isEqualTo("provider")
        assertThat(faxSendResponse.status()).isEqualTo(FaxSendResponse.Status.QUEUED)
        assertThat(faxSendResponse.to()).isEqualTo("to")
        assertThat(faxSendResponse.estimatedDelivery()).contains("estimatedDelivery")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxSendResponse =
            FaxSendResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .from("from")
                .provider("provider")
                .status(FaxSendResponse.Status.QUEUED)
                .to("to")
                .estimatedDelivery("estimatedDelivery")
                .build()

        val roundtrippedFaxSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxSendResponse),
                jacksonTypeRef<FaxSendResponse>(),
            )

        assertThat(roundtrippedFaxSendResponse).isEqualTo(faxSendResponse)
    }
}
