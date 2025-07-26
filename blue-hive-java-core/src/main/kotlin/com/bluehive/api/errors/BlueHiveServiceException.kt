// File generated from our OpenAPI spec by Stainless.

package com.bluehive.api.errors

import com.bluehive.api.core.JsonValue
import com.bluehive.api.core.http.Headers

abstract class BlueHiveServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BlueHiveException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
