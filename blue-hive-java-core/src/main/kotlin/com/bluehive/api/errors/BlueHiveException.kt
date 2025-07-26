package com.bluehive.api.errors

open class BlueHiveException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
