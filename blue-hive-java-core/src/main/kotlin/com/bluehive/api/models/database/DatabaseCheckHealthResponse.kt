// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.database

import com.bluehive.api.core.Enum
import com.bluehive.api.core.ExcludeMissing
import com.bluehive.api.core.JsonField
import com.bluehive.api.core.JsonMissing
import com.bluehive.api.core.JsonValue
import com.bluehive.api.core.checkRequired
import com.bluehive.api.errors.BlueHiveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DatabaseCheckHealthResponse
private constructor(
    private val status: JsonField<Status>,
    private val timestamp: JsonField<String>,
    private val database: JsonField<String>,
    private val error: JsonField<String>,
    private val stats: JsonField<Stats>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("database") @ExcludeMissing database: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stats") @ExcludeMissing stats: JsonField<Stats> = JsonMissing.of(),
    ) : this(status, timestamp, database, error, stats, mutableMapOf())

    /**
     * Database health status
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Health check timestamp
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): String = timestamp.getRequired("timestamp")

    /**
     * Database name (hidden in production)
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun database(): Optional<String> = database.getOptional("database")

    /**
     * Error message if status is error
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Database statistics (not available in production)
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stats(): Optional<Stats> = stats.getOptional("stats")

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<String> = timestamp

    /**
     * Returns the raw JSON value of [database].
     *
     * Unlike [database], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("database") @ExcludeMissing fun _database(): JsonField<String> = database

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [stats].
     *
     * Unlike [stats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stats") @ExcludeMissing fun _stats(): JsonField<Stats> = stats

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatabaseCheckHealthResponse].
         *
         * The following fields are required:
         * ```java
         * .status()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatabaseCheckHealthResponse]. */
    class Builder internal constructor() {

        private var status: JsonField<Status>? = null
        private var timestamp: JsonField<String>? = null
        private var database: JsonField<String> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var stats: JsonField<Stats> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(databaseCheckHealthResponse: DatabaseCheckHealthResponse) = apply {
            status = databaseCheckHealthResponse.status
            timestamp = databaseCheckHealthResponse.timestamp
            database = databaseCheckHealthResponse.database
            error = databaseCheckHealthResponse.error
            stats = databaseCheckHealthResponse.stats
            additionalProperties = databaseCheckHealthResponse.additionalProperties.toMutableMap()
        }

        /** Database health status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Health check timestamp */
        fun timestamp(timestamp: String) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<String>) = apply { this.timestamp = timestamp }

        /** Database name (hidden in production) */
        fun database(database: String) = database(JsonField.of(database))

        /**
         * Sets [Builder.database] to an arbitrary JSON value.
         *
         * You should usually call [Builder.database] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun database(database: JsonField<String>) = apply { this.database = database }

        /** Error message if status is error */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Database statistics (not available in production) */
        fun stats(stats: Stats) = stats(JsonField.of(stats))

        /**
         * Sets [Builder.stats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stats] with a well-typed [Stats] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stats(stats: JsonField<Stats>) = apply { this.stats = stats }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [DatabaseCheckHealthResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatabaseCheckHealthResponse =
            DatabaseCheckHealthResponse(
                checkRequired("status", status),
                checkRequired("timestamp", timestamp),
                database,
                error,
                stats,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatabaseCheckHealthResponse = apply {
        if (validated) {
            return@apply
        }

        status().validate()
        timestamp()
        database()
        error()
        stats().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: BlueHiveInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (database.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (stats.asKnown().getOrNull()?.validity() ?: 0)

    /** Database health status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OK = of("ok")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OK,
            ERROR,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OK,
            ERROR,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                OK -> Value.OK
                ERROR -> Value.ERROR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BlueHiveInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OK -> Known.OK
                ERROR -> Known.ERROR
                else -> throw BlueHiveInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BlueHiveInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BlueHiveInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BlueHiveInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Database statistics (not available in production) */
    class Stats
    private constructor(
        private val collections: JsonField<Double>,
        private val dataSize: JsonField<Double>,
        private val documents: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("collections")
            @ExcludeMissing
            collections: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("dataSize")
            @ExcludeMissing
            dataSize: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("documents")
            @ExcludeMissing
            documents: JsonField<Double> = JsonMissing.of(),
        ) : this(collections, dataSize, documents, mutableMapOf())

        /**
         * Number of collections
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun collections(): Optional<Double> = collections.getOptional("collections")

        /**
         * Total data size in bytes
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataSize(): Optional<Double> = dataSize.getOptional("dataSize")

        /**
         * Total number of documents
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun documents(): Optional<Double> = documents.getOptional("documents")

        /**
         * Returns the raw JSON value of [collections].
         *
         * Unlike [collections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collections")
        @ExcludeMissing
        fun _collections(): JsonField<Double> = collections

        /**
         * Returns the raw JSON value of [dataSize].
         *
         * Unlike [dataSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataSize") @ExcludeMissing fun _dataSize(): JsonField<Double> = dataSize

        /**
         * Returns the raw JSON value of [documents].
         *
         * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documents") @ExcludeMissing fun _documents(): JsonField<Double> = documents

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Stats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Stats]. */
        class Builder internal constructor() {

            private var collections: JsonField<Double> = JsonMissing.of()
            private var dataSize: JsonField<Double> = JsonMissing.of()
            private var documents: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(stats: Stats) = apply {
                collections = stats.collections
                dataSize = stats.dataSize
                documents = stats.documents
                additionalProperties = stats.additionalProperties.toMutableMap()
            }

            /** Number of collections */
            fun collections(collections: Double) = collections(JsonField.of(collections))

            /**
             * Sets [Builder.collections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collections] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collections(collections: JsonField<Double>) = apply {
                this.collections = collections
            }

            /** Total data size in bytes */
            fun dataSize(dataSize: Double) = dataSize(JsonField.of(dataSize))

            /**
             * Sets [Builder.dataSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSize] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSize(dataSize: JsonField<Double>) = apply { this.dataSize = dataSize }

            /** Total number of documents */
            fun documents(documents: Double) = documents(JsonField.of(documents))

            /**
             * Sets [Builder.documents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documents] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documents(documents: JsonField<Double>) = apply { this.documents = documents }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Stats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Stats =
                Stats(collections, dataSize, documents, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Stats = apply {
            if (validated) {
                return@apply
            }

            collections()
            dataSize()
            documents()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BlueHiveInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (collections.asKnown().isPresent) 1 else 0) +
                (if (dataSize.asKnown().isPresent) 1 else 0) +
                (if (documents.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Stats &&
                collections == other.collections &&
                dataSize == other.dataSize &&
                documents == other.documents &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(collections, dataSize, documents, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Stats{collections=$collections, dataSize=$dataSize, documents=$documents, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatabaseCheckHealthResponse &&
            status == other.status &&
            timestamp == other.timestamp &&
            database == other.database &&
            error == other.error &&
            stats == other.stats &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(status, timestamp, database, error, stats, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatabaseCheckHealthResponse{status=$status, timestamp=$timestamp, database=$database, error=$error, stats=$stats, additionalProperties=$additionalProperties}"
}
