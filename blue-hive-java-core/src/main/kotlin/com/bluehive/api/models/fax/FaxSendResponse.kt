// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.fax

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

class FaxSendResponse
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val from: JsonField<String>,
    private val provider: JsonField<String>,
    private val status: JsonField<Status>,
    private val to: JsonField<String>,
    private val estimatedDelivery: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estimatedDelivery")
        @ExcludeMissing
        estimatedDelivery: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, from, provider, status, to, estimatedDelivery, mutableMapOf())

    /**
     * Unique fax identifier
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * ISO timestamp when fax was created
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("createdAt")

    /**
     * Sender fax number
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = from.getRequired("from")

    /**
     * Provider used to send the fax
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provider(): String = provider.getRequired("provider")

    /**
     * Current fax status
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Recipient fax number
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = to.getRequired("to")

    /**
     * Estimated delivery time (ISO timestamp)
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedDelivery(): Optional<String> = estimatedDelivery.getOptional("estimatedDelivery")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [estimatedDelivery].
     *
     * Unlike [estimatedDelivery], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estimatedDelivery")
    @ExcludeMissing
    fun _estimatedDelivery(): JsonField<String> = estimatedDelivery

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
         * Returns a mutable builder for constructing an instance of [FaxSendResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .from()
         * .provider()
         * .status()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FaxSendResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var from: JsonField<String>? = null
        private var provider: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var to: JsonField<String>? = null
        private var estimatedDelivery: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(faxSendResponse: FaxSendResponse) = apply {
            id = faxSendResponse.id
            createdAt = faxSendResponse.createdAt
            from = faxSendResponse.from
            provider = faxSendResponse.provider
            status = faxSendResponse.status
            to = faxSendResponse.to
            estimatedDelivery = faxSendResponse.estimatedDelivery
            additionalProperties = faxSendResponse.additionalProperties.toMutableMap()
        }

        /** Unique fax identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO timestamp when fax was created */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Sender fax number */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** Provider used to send the fax */
        fun provider(provider: String) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { this.provider = provider }

        /** Current fax status */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Recipient fax number */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** Estimated delivery time (ISO timestamp) */
        fun estimatedDelivery(estimatedDelivery: String) =
            estimatedDelivery(JsonField.of(estimatedDelivery))

        /**
         * Sets [Builder.estimatedDelivery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedDelivery] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estimatedDelivery(estimatedDelivery: JsonField<String>) = apply {
            this.estimatedDelivery = estimatedDelivery
        }

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
         * Returns an immutable instance of [FaxSendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .from()
         * .provider()
         * .status()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FaxSendResponse =
            FaxSendResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("from", from),
                checkRequired("provider", provider),
                checkRequired("status", status),
                checkRequired("to", to),
                estimatedDelivery,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FaxSendResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        from()
        provider()
        status().validate()
        to()
        estimatedDelivery()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (if (provider.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (to.asKnown().isPresent) 1 else 0) +
            (if (estimatedDelivery.asKnown().isPresent) 1 else 0)

    /** Current fax status */
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

            @JvmField val QUEUED = of("queued")

            @JvmField val DIALING = of("dialing")

            @JvmField val SENDING = of("sending")

            @JvmField val DELIVERED = of("delivered")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val RETRYING = of("retrying")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            QUEUED,
            DIALING,
            SENDING,
            DELIVERED,
            FAILED,
            CANCELLED,
            RETRYING,
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
            QUEUED,
            DIALING,
            SENDING,
            DELIVERED,
            FAILED,
            CANCELLED,
            RETRYING,
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
                QUEUED -> Value.QUEUED
                DIALING -> Value.DIALING
                SENDING -> Value.SENDING
                DELIVERED -> Value.DELIVERED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
                RETRYING -> Value.RETRYING
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
                QUEUED -> Known.QUEUED
                DIALING -> Known.DIALING
                SENDING -> Known.SENDING
                DELIVERED -> Known.DELIVERED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                RETRYING -> Known.RETRYING
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FaxSendResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            from == other.from &&
            provider == other.provider &&
            status == other.status &&
            to == other.to &&
            estimatedDelivery == other.estimatedDelivery &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            from,
            provider,
            status,
            to,
            estimatedDelivery,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FaxSendResponse{id=$id, createdAt=$createdAt, from=$from, provider=$provider, status=$status, to=$to, estimatedDelivery=$estimatedDelivery, additionalProperties=$additionalProperties}"
}
