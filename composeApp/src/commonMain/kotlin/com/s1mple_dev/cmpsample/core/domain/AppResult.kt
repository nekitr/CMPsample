package com.s1mple_dev.cmpsample.core.domain

sealed class AppResult<out T : Any?> {
    open class Success<out T : Any?>(open val data: T) : AppResult<T>()
    open class Failure(val details: DataError) : AppResult<Nothing>()

    fun <NewT : Any?> map(transform: (T) -> NewT): AppResult<NewT> {
        return when (this) {
            is Success -> Success(transform(data))
            is Failure -> this
        }
    }

    suspend fun <NewT : Any?> flatMap(transform: suspend (T) -> AppResult<NewT>): AppResult<NewT> {
        return when (this) {
            is Success -> transform(data)
            is Failure -> this
        }
    }
}