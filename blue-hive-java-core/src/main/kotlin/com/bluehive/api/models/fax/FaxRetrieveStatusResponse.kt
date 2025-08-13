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

class FaxRetrieveStatusResponse
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val from: JsonField<String>,
    private val provider: JsonField<String>,
    private val status: JsonField<Status>,
    private val to: JsonField<String>,
    private val updatedAt: JsonField<String>,
    private val cost: JsonField<Double>,
    private val deliveredAt: JsonField<String>,
    private val duration: JsonField<Double>,
    private val errorMessage: JsonField<String>,
    private val pageCount: JsonField<Double>,
    private val providerData: JsonValue,
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
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost") @ExcludeMissing cost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("deliveredAt")
        @ExcludeMissing
        deliveredAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("errorMessage")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pageCount") @ExcludeMissing pageCount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("providerData") @ExcludeMissing providerData: JsonValue = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        from,
        provider,
        status,
        to,
        updatedAt,
        cost,
        deliveredAt,
        duration,
        errorMessage,
        pageCount,
        providerData,
        mutableMapOf(),
    )

    /**
     * Fax identifier
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
     * ISO timestamp when status was last updated
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): String = updatedAt.getRequired("updatedAt")

    /**
     * Cost of the fax
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cost(): Optional<Double> = cost.getOptional("cost")

    /**
     * ISO timestamp when fax was delivered
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveredAt(): Optional<String> = deliveredAt.getOptional("deliveredAt")

    /**
     * Call duration in seconds
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun duration(): Optional<Double> = duration.getOptional("duration")

    /**
     * Error message if fax failed
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("errorMessage")

    /**
     * Number of pages in the fax
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageCount(): Optional<Double> = pageCount.getOptional("pageCount")

    /** Provider-specific additional data */
    @JsonProperty("providerData") @ExcludeMissing fun _providerData(): JsonValue = providerData

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [cost].
     *
     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

    /**
     * Returns the raw JSON value of [deliveredAt].
     *
     * Unlike [deliveredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deliveredAt") @ExcludeMissing fun _deliveredAt(): JsonField<String> = deliveredAt

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errorMessage")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [pageCount].
     *
     * Unlike [pageCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pageCount") @ExcludeMissing fun _pageCount(): JsonField<Double> = pageCount

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
         * Returns a mutable builder for constructing an instance of [FaxRetrieveStatusResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .from()
         * .provider()
         * .status()
         * .to()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FaxRetrieveStatusResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<String>? = null
        private var from: JsonField<String>? = null
        private var provider: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var to: JsonField<String>? = null
        private var updatedAt: JsonField<String>? = null
        private var cost: JsonField<Double> = JsonMissing.of()
        private var deliveredAt: JsonField<String> = JsonMissing.of()
        private var duration: JsonField<Double> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var pageCount: JsonField<Double> = JsonMissing.of()
        private var providerData: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(faxRetrieveStatusResponse: FaxRetrieveStatusResponse) = apply {
            id = faxRetrieveStatusResponse.id
            createdAt = faxRetrieveStatusResponse.createdAt
            from = faxRetrieveStatusResponse.from
            provider = faxRetrieveStatusResponse.provider
            status = faxRetrieveStatusResponse.status
            to = faxRetrieveStatusResponse.to
            updatedAt = faxRetrieveStatusResponse.updatedAt
            cost = faxRetrieveStatusResponse.cost
            deliveredAt = faxRetrieveStatusResponse.deliveredAt
            duration = faxRetrieveStatusResponse.duration
            errorMessage = faxRetrieveStatusResponse.errorMessage
            pageCount = faxRetrieveStatusResponse.pageCount
            providerData = faxRetrieveStatusResponse.providerData
            additionalProperties = faxRetrieveStatusResponse.additionalProperties.toMutableMap()
        }

        /** Fax identifier */
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

        /** ISO timestamp when status was last updated */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

        /** Cost of the fax */
        fun cost(cost: Double) = cost(JsonField.of(cost))

        /**
         * Sets [Builder.cost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cost] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

        /** ISO timestamp when fax was delivered */
        fun deliveredAt(deliveredAt: String) = deliveredAt(JsonField.of(deliveredAt))

        /**
         * Sets [Builder.deliveredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveredAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deliveredAt(deliveredAt: JsonField<String>) = apply { this.deliveredAt = deliveredAt }

        /** Call duration in seconds */
        fun duration(duration: Double) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

        /** Error message if fax failed */
        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Number of pages in the fax */
        fun pageCount(pageCount: Double) = pageCount(JsonField.of(pageCount))

        /**
         * Sets [Builder.pageCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageCount] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pageCount(pageCount: JsonField<Double>) = apply { this.pageCount = pageCount }

        /** Provider-specific additional data */
        fun providerData(providerData: JsonValue) = apply { this.providerData = providerData }

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
         * Returns an immutable instance of [FaxRetrieveStatusResponse].
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
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FaxRetrieveStatusResponse =
            FaxRetrieveStatusResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("from", from),
                checkRequired("provider", provider),
                checkRequired("status", status),
                checkRequired("to", to),
                checkRequired("updatedAt", updatedAt),
                cost,
                deliveredAt,
                duration,
                errorMessage,
                pageCount,
                providerData,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FaxRetrieveStatusResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        from()
        provider()
        status().validate()
        to()
        updatedAt()
        cost()
        deliveredAt()
        duration()
        errorMessage()
        pageCount()
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
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (cost.asKnown().isPresent) 1 else 0) +
            (if (deliveredAt.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (pageCount.asKnown().isPresent) 1 else 0)

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

        return other is FaxRetrieveStatusResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            from == other.from &&
            provider == other.provider &&
            status == other.status &&
            to == other.to &&
            updatedAt == other.updatedAt &&
            cost == other.cost &&
            deliveredAt == other.deliveredAt &&
            duration == other.duration &&
            errorMessage == other.errorMessage &&
            pageCount == other.pageCount &&
            providerData == other.providerData &&
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
            updatedAt,
            cost,
            deliveredAt,
            duration,
            errorMessage,
            pageCount,
            providerData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FaxRetrieveStatusResponse{id=$id, createdAt=$createdAt, from=$from, provider=$provider, status=$status, to=$to, updatedAt=$updatedAt, cost=$cost, deliveredAt=$deliveredAt, duration=$duration, errorMessage=$errorMessage, pageCount=$pageCount, providerData=$providerData, additionalProperties=$additionalProperties}"
}
