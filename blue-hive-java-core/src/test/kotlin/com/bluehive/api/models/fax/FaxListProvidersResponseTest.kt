// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FaxListProvidersResponseTest {

    @Test
    fun create() {
        val faxListProvidersResponse =
            FaxListProvidersResponse.builder()
                .addProvider(
                    FaxListProvidersResponse.Provider.builder()
                        .configured(true)
                        .isDefault(true)
                        .name("name")
                        .build()
                )
                .build()

        assertThat(faxListProvidersResponse.providers())
            .containsExactly(
                FaxListProvidersResponse.Provider.builder()
                    .configured(true)
                    .isDefault(true)
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val faxListProvidersResponse =
            FaxListProvidersResponse.builder()
                .addProvider(
                    FaxListProvidersResponse.Provider.builder()
                        .configured(true)
                        .isDefault(true)
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedFaxListProvidersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(faxListProvidersResponse),
                jacksonTypeRef<FaxListProvidersResponse>(),
            )

        assertThat(roundtrippedFaxListProvidersResponse).isEqualTo(faxListProvidersResponse)
    }
}
