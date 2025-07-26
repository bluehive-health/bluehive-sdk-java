// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FaxRetrieveStatusParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        FaxRetrieveStatusParams.builder().id("id").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = FaxRetrieveStatusParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
