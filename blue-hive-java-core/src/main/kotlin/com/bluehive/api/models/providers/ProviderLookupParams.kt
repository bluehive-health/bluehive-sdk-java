// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.models.providers

import com.bluehive.api.core.Params
import com.bluehive.api.core.http.Headers
import com.bluehive.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Search for healthcare providers by NPI number, name, or location proximity. */
class ProviderLookupParams
private constructor(
    private val firstname: String?,
    private val lastname: String?,
    private val npi: String?,
    private val zipcode: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Provider first name */
    fun firstname(): Optional<String> = Optional.ofNullable(firstname)

    /** Provider last name */
    fun lastname(): Optional<String> = Optional.ofNullable(lastname)

    /** Provider NPI number */
    fun npi(): Optional<String> = Optional.ofNullable(npi)

    /** ZIP code to filter results by proximity */
    fun zipcode(): Optional<String> = Optional.ofNullable(zipcode)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProviderLookupParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProviderLookupParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProviderLookupParams]. */
    class Builder internal constructor() {

        private var firstname: String? = null
        private var lastname: String? = null
        private var npi: String? = null
        private var zipcode: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(providerLookupParams: ProviderLookupParams) = apply {
            firstname = providerLookupParams.firstname
            lastname = providerLookupParams.lastname
            npi = providerLookupParams.npi
            zipcode = providerLookupParams.zipcode
            additionalHeaders = providerLookupParams.additionalHeaders.toBuilder()
            additionalQueryParams = providerLookupParams.additionalQueryParams.toBuilder()
        }

        /** Provider first name */
        fun firstname(firstname: String?) = apply { this.firstname = firstname }

        /** Alias for calling [Builder.firstname] with `firstname.orElse(null)`. */
        fun firstname(firstname: Optional<String>) = firstname(firstname.getOrNull())

        /** Provider last name */
        fun lastname(lastname: String?) = apply { this.lastname = lastname }

        /** Alias for calling [Builder.lastname] with `lastname.orElse(null)`. */
        fun lastname(lastname: Optional<String>) = lastname(lastname.getOrNull())

        /** Provider NPI number */
        fun npi(npi: String?) = apply { this.npi = npi }

        /** Alias for calling [Builder.npi] with `npi.orElse(null)`. */
        fun npi(npi: Optional<String>) = npi(npi.getOrNull())

        /** ZIP code to filter results by proximity */
        fun zipcode(zipcode: String?) = apply { this.zipcode = zipcode }

        /** Alias for calling [Builder.zipcode] with `zipcode.orElse(null)`. */
        fun zipcode(zipcode: Optional<String>) = zipcode(zipcode.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ProviderLookupParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProviderLookupParams =
            ProviderLookupParams(
                firstname,
                lastname,
                npi,
                zipcode,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                firstname?.let { put("firstname", it) }
                lastname?.let { put("lastname", it) }
                npi?.let { put("npi", it) }
                zipcode?.let { put("zipcode", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderLookupParams && firstname == other.firstname && lastname == other.lastname && npi == other.npi && zipcode == other.zipcode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(firstname, lastname, npi, zipcode, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProviderLookupParams{firstname=$firstname, lastname=$lastname, npi=$npi, zipcode=$zipcode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
