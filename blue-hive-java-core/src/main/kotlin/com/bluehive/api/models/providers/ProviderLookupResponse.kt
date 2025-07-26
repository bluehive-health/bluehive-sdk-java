// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.providers

import com.bluehive.api.core.ExcludeMissing
import com.bluehive.api.core.JsonField
import com.bluehive.api.core.JsonMissing
import com.bluehive.api.core.JsonValue
import com.bluehive.api.core.checkKnown
import com.bluehive.api.core.checkRequired
import com.bluehive.api.core.toImmutable
import com.bluehive.api.errors.BlueHiveInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ProviderLookupResponse
private constructor(
    private val count: JsonField<Double>,
    private val providers: JsonField<List<Provider>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("count") @ExcludeMissing count: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("providers")
        @ExcludeMissing
        providers: JsonField<List<Provider>> = JsonMissing.of(),
    ) : this(count, providers, mutableMapOf())

    /**
     * Number of providers found
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun count(): Double = count.getRequired("count")

    /**
     * List of matching providers
     *
     * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providers(): List<Provider> = providers.getRequired("providers")

    /**
     * Returns the raw JSON value of [count].
     *
     * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Double> = count

    /**
     * Returns the raw JSON value of [providers].
     *
     * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providers")
    @ExcludeMissing
    fun _providers(): JsonField<List<Provider>> = providers

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
         * Returns a mutable builder for constructing an instance of [ProviderLookupResponse].
         *
         * The following fields are required:
         * ```java
         * .count()
         * .providers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderLookupResponse]. */
    class Builder internal constructor() {

        private var count: JsonField<Double>? = null
        private var providers: JsonField<MutableList<Provider>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(providerLookupResponse: ProviderLookupResponse) = apply {
            count = providerLookupResponse.count
            providers = providerLookupResponse.providers.map { it.toMutableList() }
            additionalProperties = providerLookupResponse.additionalProperties.toMutableMap()
        }

        /** Number of providers found */
        fun count(count: Double) = count(JsonField.of(count))

        /**
         * Sets [Builder.count] to an arbitrary JSON value.
         *
         * You should usually call [Builder.count] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun count(count: JsonField<Double>) = apply { this.count = count }

        /** List of matching providers */
        fun providers(providers: List<Provider>) = providers(JsonField.of(providers))

        /**
         * Sets [Builder.providers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providers] with a well-typed `List<Provider>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providers(providers: JsonField<List<Provider>>) = apply {
            this.providers = providers.map { it.toMutableList() }
        }

        /**
         * Adds a single [Provider] to [providers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: Provider) = apply {
            providers =
                (providers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("providers", it).add(provider)
                }
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
         * Returns an immutable instance of [ProviderLookupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .count()
         * .providers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProviderLookupResponse =
            ProviderLookupResponse(
                checkRequired("count", count),
                checkRequired("providers", providers).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProviderLookupResponse = apply {
        if (validated) {
            return@apply
        }

        count()
        providers().forEach { it.validate() }
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
        (if (count.asKnown().isPresent) 1 else 0) +
            (providers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Provider
    private constructor(
        private val address1: JsonField<String>,
        private val address2: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val distance: JsonField<Double>,
        private val faxNumber: JsonField<String>,
        private val firstname: JsonField<String>,
        private val lastname: JsonField<String>,
        private val npi: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val stateProvince: JsonField<String>,
        private val workPhone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address_1")
            @ExcludeMissing
            address1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address_2")
            @ExcludeMissing
            address2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("distance")
            @ExcludeMissing
            distance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("fax_number")
            @ExcludeMissing
            faxNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstname")
            @ExcludeMissing
            firstname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastname")
            @ExcludeMissing
            lastname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("npi") @ExcludeMissing npi: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state_province")
            @ExcludeMissing
            stateProvince: JsonField<String> = JsonMissing.of(),
            @JsonProperty("work_phone")
            @ExcludeMissing
            workPhone: JsonField<String> = JsonMissing.of(),
        ) : this(
            address1,
            address2,
            city,
            country,
            distance,
            faxNumber,
            firstname,
            lastname,
            npi,
            postalCode,
            stateProvince,
            workPhone,
            mutableMapOf(),
        )

        /**
         * Primary address line
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address1(): String = address1.getRequired("address_1")

        /**
         * Secondary address line (suite, unit, etc.)
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address2(): String = address2.getRequired("address_2")

        /**
         * City
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country code
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * Distance in miles from the provided ZIP code
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun distance(): Double = distance.getRequired("distance")

        /**
         * Fax number
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun faxNumber(): String = faxNumber.getRequired("fax_number")

        /**
         * Provider first name
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstname(): String = firstname.getRequired("firstname")

        /**
         * Provider last name or organization name
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastname(): String = lastname.getRequired("lastname")

        /**
         * National Provider Identifier (NPI) number
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun npi(): String = npi.getRequired("npi")

        /**
         * Postal/ZIP code
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * State or province code
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun stateProvince(): String = stateProvince.getRequired("state_province")

        /**
         * Work phone number
         *
         * @throws BlueHiveInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun workPhone(): String = workPhone.getRequired("work_phone")

        /**
         * Returns the raw JSON value of [address1].
         *
         * Unlike [address1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_1") @ExcludeMissing fun _address1(): JsonField<String> = address1

        /**
         * Returns the raw JSON value of [address2].
         *
         * Unlike [address2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address_2") @ExcludeMissing fun _address2(): JsonField<String> = address2

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [distance].
         *
         * Unlike [distance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("distance") @ExcludeMissing fun _distance(): JsonField<Double> = distance

        /**
         * Returns the raw JSON value of [faxNumber].
         *
         * Unlike [faxNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fax_number") @ExcludeMissing fun _faxNumber(): JsonField<String> = faxNumber

        /**
         * Returns the raw JSON value of [firstname].
         *
         * Unlike [firstname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstname") @ExcludeMissing fun _firstname(): JsonField<String> = firstname

        /**
         * Returns the raw JSON value of [lastname].
         *
         * Unlike [lastname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastname") @ExcludeMissing fun _lastname(): JsonField<String> = lastname

        /**
         * Returns the raw JSON value of [npi].
         *
         * Unlike [npi], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("npi") @ExcludeMissing fun _npi(): JsonField<String> = npi

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [stateProvince].
         *
         * Unlike [stateProvince], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("state_province")
        @ExcludeMissing
        fun _stateProvince(): JsonField<String> = stateProvince

        /**
         * Returns the raw JSON value of [workPhone].
         *
         * Unlike [workPhone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("work_phone") @ExcludeMissing fun _workPhone(): JsonField<String> = workPhone

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
             * Returns a mutable builder for constructing an instance of [Provider].
             *
             * The following fields are required:
             * ```java
             * .address1()
             * .address2()
             * .city()
             * .country()
             * .distance()
             * .faxNumber()
             * .firstname()
             * .lastname()
             * .npi()
             * .postalCode()
             * .stateProvince()
             * .workPhone()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Provider]. */
        class Builder internal constructor() {

            private var address1: JsonField<String>? = null
            private var address2: JsonField<String>? = null
            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var distance: JsonField<Double>? = null
            private var faxNumber: JsonField<String>? = null
            private var firstname: JsonField<String>? = null
            private var lastname: JsonField<String>? = null
            private var npi: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var stateProvince: JsonField<String>? = null
            private var workPhone: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(provider: Provider) = apply {
                address1 = provider.address1
                address2 = provider.address2
                city = provider.city
                country = provider.country
                distance = provider.distance
                faxNumber = provider.faxNumber
                firstname = provider.firstname
                lastname = provider.lastname
                npi = provider.npi
                postalCode = provider.postalCode
                stateProvince = provider.stateProvince
                workPhone = provider.workPhone
                additionalProperties = provider.additionalProperties.toMutableMap()
            }

            /** Primary address line */
            fun address1(address1: String) = address1(JsonField.of(address1))

            /**
             * Sets [Builder.address1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address1(address1: JsonField<String>) = apply { this.address1 = address1 }

            /** Secondary address line (suite, unit, etc.) */
            fun address2(address2: String) = address2(JsonField.of(address2))

            /**
             * Sets [Builder.address2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address2(address2: JsonField<String>) = apply { this.address2 = address2 }

            /** City */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Country code */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Distance in miles from the provided ZIP code */
            fun distance(distance: Double) = distance(JsonField.of(distance))

            /**
             * Sets [Builder.distance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun distance(distance: JsonField<Double>) = apply { this.distance = distance }

            /** Fax number */
            fun faxNumber(faxNumber: String) = faxNumber(JsonField.of(faxNumber))

            /**
             * Sets [Builder.faxNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.faxNumber] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun faxNumber(faxNumber: JsonField<String>) = apply { this.faxNumber = faxNumber }

            /** Provider first name */
            fun firstname(firstname: String) = firstname(JsonField.of(firstname))

            /**
             * Sets [Builder.firstname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstname(firstname: JsonField<String>) = apply { this.firstname = firstname }

            /** Provider last name or organization name */
            fun lastname(lastname: String) = lastname(JsonField.of(lastname))

            /**
             * Sets [Builder.lastname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastname(lastname: JsonField<String>) = apply { this.lastname = lastname }

            /** National Provider Identifier (NPI) number */
            fun npi(npi: String) = npi(JsonField.of(npi))

            /**
             * Sets [Builder.npi] to an arbitrary JSON value.
             *
             * You should usually call [Builder.npi] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun npi(npi: JsonField<String>) = apply { this.npi = npi }

            /** Postal/ZIP code */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** State or province code */
            fun stateProvince(stateProvince: String) = stateProvince(JsonField.of(stateProvince))

            /**
             * Sets [Builder.stateProvince] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateProvince] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateProvince(stateProvince: JsonField<String>) = apply {
                this.stateProvince = stateProvince
            }

            /** Work phone number */
            fun workPhone(workPhone: String) = workPhone(JsonField.of(workPhone))

            /**
             * Sets [Builder.workPhone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workPhone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workPhone(workPhone: JsonField<String>) = apply { this.workPhone = workPhone }

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
             * Returns an immutable instance of [Provider].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address1()
             * .address2()
             * .city()
             * .country()
             * .distance()
             * .faxNumber()
             * .firstname()
             * .lastname()
             * .npi()
             * .postalCode()
             * .stateProvince()
             * .workPhone()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Provider =
                Provider(
                    checkRequired("address1", address1),
                    checkRequired("address2", address2),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("distance", distance),
                    checkRequired("faxNumber", faxNumber),
                    checkRequired("firstname", firstname),
                    checkRequired("lastname", lastname),
                    checkRequired("npi", npi),
                    checkRequired("postalCode", postalCode),
                    checkRequired("stateProvince", stateProvince),
                    checkRequired("workPhone", workPhone),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Provider = apply {
            if (validated) {
                return@apply
            }

            address1()
            address2()
            city()
            country()
            distance()
            faxNumber()
            firstname()
            lastname()
            npi()
            postalCode()
            stateProvince()
            workPhone()
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
            (if (address1.asKnown().isPresent) 1 else 0) +
                (if (address2.asKnown().isPresent) 1 else 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (distance.asKnown().isPresent) 1 else 0) +
                (if (faxNumber.asKnown().isPresent) 1 else 0) +
                (if (firstname.asKnown().isPresent) 1 else 0) +
                (if (lastname.asKnown().isPresent) 1 else 0) +
                (if (npi.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (stateProvince.asKnown().isPresent) 1 else 0) +
                (if (workPhone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Provider && address1 == other.address1 && address2 == other.address2 && city == other.city && country == other.country && distance == other.distance && faxNumber == other.faxNumber && firstname == other.firstname && lastname == other.lastname && npi == other.npi && postalCode == other.postalCode && stateProvince == other.stateProvince && workPhone == other.workPhone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address1, address2, city, country, distance, faxNumber, firstname, lastname, npi, postalCode, stateProvince, workPhone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Provider{address1=$address1, address2=$address2, city=$city, country=$country, distance=$distance, faxNumber=$faxNumber, firstname=$firstname, lastname=$lastname, npi=$npi, postalCode=$postalCode, stateProvince=$stateProvince, workPhone=$workPhone, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderLookupResponse && count == other.count && providers == other.providers && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(count, providers, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProviderLookupResponse{count=$count, providers=$providers, additionalProperties=$additionalProperties}"
}
