// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.database

import com.bluehive.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatabaseCheckHealthResponseTest {

    @Test
    fun create() {
        val databaseCheckHealthResponse =
            DatabaseCheckHealthResponse.builder()
                .status(DatabaseCheckHealthResponse.Status.OK)
                .timestamp("timestamp")
                .database("database")
                .error("error")
                .stats(
                    DatabaseCheckHealthResponse.Stats.builder()
                        .collections(0.0)
                        .dataSize(0.0)
                        .documents(0.0)
                        .build()
                )
                .build()

        assertThat(databaseCheckHealthResponse.status())
            .isEqualTo(DatabaseCheckHealthResponse.Status.OK)
        assertThat(databaseCheckHealthResponse.timestamp()).isEqualTo("timestamp")
        assertThat(databaseCheckHealthResponse.database()).contains("database")
        assertThat(databaseCheckHealthResponse.error()).contains("error")
        assertThat(databaseCheckHealthResponse.stats())
            .contains(
                DatabaseCheckHealthResponse.Stats.builder()
                    .collections(0.0)
                    .dataSize(0.0)
                    .documents(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val databaseCheckHealthResponse =
            DatabaseCheckHealthResponse.builder()
                .status(DatabaseCheckHealthResponse.Status.OK)
                .timestamp("timestamp")
                .database("database")
                .error("error")
                .stats(
                    DatabaseCheckHealthResponse.Stats.builder()
                        .collections(0.0)
                        .dataSize(0.0)
                        .documents(0.0)
                        .build()
                )
                .build()

        val roundtrippedDatabaseCheckHealthResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(databaseCheckHealthResponse),
                jacksonTypeRef<DatabaseCheckHealthResponse>(),
            )

        assertThat(roundtrippedDatabaseCheckHealthResponse).isEqualTo(databaseCheckHealthResponse)
    }
}
