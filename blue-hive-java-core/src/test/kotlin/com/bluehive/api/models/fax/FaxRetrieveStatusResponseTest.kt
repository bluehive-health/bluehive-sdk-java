// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

import com.bluehive.api.core.JsonValue
import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxRetrieveStatusResponseTest {

    @Test
    fun create() {
        val faxRetrieveStatusResponse =
            FaxRetrieveStatusResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .from("from")
                .provider("provider")
                .status(FaxRetrieveStatusResponse.Status.QUEUED)
                .to("to")
                .updatedAt("updatedAt")
                .cost(0.0)
                .deliveredAt("deliveredAt")
                .duration(0.0)
                .errorMessage("errorMessage")
                .pageCount(0.0)
                .providerData(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(faxRetrieveStatusResponse.id()).isEqualTo("id")
        assertThat(faxRetrieveStatusResponse.createdAt()).isEqualTo("createdAt")
        assertThat(faxRetrieveStatusResponse.from()).isEqualTo("from")
        assertThat(faxRetrieveStatusResponse.provider()).isEqualTo("provider")
        assertThat(faxRetrieveStatusResponse.status())
            .isEqualTo(FaxRetrieveStatusResponse.Status.QUEUED)
        assertThat(faxRetrieveStatusResponse.to()).isEqualTo("to")
        assertThat(faxRetrieveStatusResponse.updatedAt()).isEqualTo("updatedAt")
        assertThat(faxRetrieveStatusResponse.cost()).contains(0.0)
        assertThat(faxRetrieveStatusResponse.deliveredAt()).contains("deliveredAt")
        assertThat(faxRetrieveStatusResponse.duration()).contains(0.0)
        assertThat(faxRetrieveStatusResponse.errorMessage()).contains("errorMessage")
        assertThat(faxRetrieveStatusResponse.pageCount()).contains(0.0)
        assertThat(faxRetrieveStatusResponse._providerData())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxRetrieveStatusResponse =
            FaxRetrieveStatusResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .from("from")
                .provider("provider")
                .status(FaxRetrieveStatusResponse.Status.QUEUED)
                .to("to")
                .updatedAt("updatedAt")
                .cost(0.0)
                .deliveredAt("deliveredAt")
                .duration(0.0)
                .errorMessage("errorMessage")
                .pageCount(0.0)
                .providerData(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedFaxRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxRetrieveStatusResponse),
                jacksonTypeRef<FaxRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedFaxRetrieveStatusResponse).isEqualTo(faxRetrieveStatusResponse)
    }
}
