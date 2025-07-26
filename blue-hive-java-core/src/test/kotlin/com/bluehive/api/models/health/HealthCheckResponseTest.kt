// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.health

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class HealthCheckResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val healthCheckResponse =
            HealthCheckResponse.builder().status(HealthCheckResponse.Status.OK).build()

        assertThat(healthCheckResponse.status()).isEqualTo(HealthCheckResponse.Status.OK)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val healthCheckResponse =
            HealthCheckResponse.builder().status(HealthCheckResponse.Status.OK).build()

        val roundtrippedHealthCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(healthCheckResponse),
                jacksonTypeRef<HealthCheckResponse>(),
            )

        assertThat(roundtrippedHealthCheckResponse).isEqualTo(healthCheckResponse)
    }
}
