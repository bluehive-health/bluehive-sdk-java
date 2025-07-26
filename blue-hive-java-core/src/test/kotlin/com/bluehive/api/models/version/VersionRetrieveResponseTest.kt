// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.version

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VersionRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val versionRetrieveResponse = VersionRetrieveResponse.builder().version("version").build()

        assertThat(versionRetrieveResponse.version()).isEqualTo("version")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionRetrieveResponse = VersionRetrieveResponse.builder().version("version").build()

        val roundtrippedVersionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionRetrieveResponse),
                jacksonTypeRef<VersionRetrieveResponse>(),
            )

        assertThat(roundtrippedVersionRetrieveResponse).isEqualTo(versionRetrieveResponse)
    }
}
