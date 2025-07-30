// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.providers

import com.bluehive.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderLookupParamsTest {

    @Test
    fun create() {
        ProviderLookupParams.builder()
            .firstname("firstname")
            .lastname("lastname")
            .npi("npi")
            .zipcode("zipcode")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProviderLookupParams.builder()
                .firstname("firstname")
                .lastname("lastname")
                .npi("npi")
                .zipcode("zipcode")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("firstname", "firstname")
                    .put("lastname", "lastname")
                    .put("npi", "npi")
                    .put("zipcode", "zipcode")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProviderLookupParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
