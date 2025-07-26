// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.providers

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProviderLookupResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val providerLookupResponse =
            ProviderLookupResponse.builder()
                .count(0.0)
                .addProvider(
                    ProviderLookupResponse.Provider.builder()
                        .address1("address_1")
                        .address2("address_2")
                        .city("city")
                        .country("country")
                        .distance(0.0)
                        .faxNumber("fax_number")
                        .firstname("firstname")
                        .lastname("lastname")
                        .npi("npi")
                        .postalCode("postal_code")
                        .stateProvince("state_province")
                        .workPhone("work_phone")
                        .build()
                )
                .build()

        assertThat(providerLookupResponse.count()).isEqualTo(0.0)
        assertThat(providerLookupResponse.providers())
            .containsExactly(
                ProviderLookupResponse.Provider.builder()
                    .address1("address_1")
                    .address2("address_2")
                    .city("city")
                    .country("country")
                    .distance(0.0)
                    .faxNumber("fax_number")
                    .firstname("firstname")
                    .lastname("lastname")
                    .npi("npi")
                    .postalCode("postal_code")
                    .stateProvince("state_province")
                    .workPhone("work_phone")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providerLookupResponse =
            ProviderLookupResponse.builder()
                .count(0.0)
                .addProvider(
                    ProviderLookupResponse.Provider.builder()
                        .address1("address_1")
                        .address2("address_2")
                        .city("city")
                        .country("country")
                        .distance(0.0)
                        .faxNumber("fax_number")
                        .firstname("firstname")
                        .lastname("lastname")
                        .npi("npi")
                        .postalCode("postal_code")
                        .stateProvince("state_province")
                        .workPhone("work_phone")
                        .build()
                )
                .build()

        val roundtrippedProviderLookupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerLookupResponse),
                jacksonTypeRef<ProviderLookupResponse>(),
            )

        assertThat(roundtrippedProviderLookupResponse).isEqualTo(providerLookupResponse)
    }
}
