// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.proguard

import com.bluehive.api.client.okhttp.BlueHiveOkHttpClient
import com.bluehive.api.core.jsonMapper
import com.bluehive.api.models.health.HealthCheckResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/blue-hive-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = BlueHiveOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.health()).isNotNull()
        assertThat(client.version()).isNotNull()
        assertThat(client.providers()).isNotNull()
        assertThat(client.database()).isNotNull()
        assertThat(client.fax()).isNotNull()
    }

    @Test
    fun healthCheckResponseRoundtrip() {
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
