package br.com.vtvinicius.domain.mocks

import br.com.vtvinicius.domain.core.ThreadContextProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.koin.dsl.module

fun <R> Flow<R>.testFlow(test: R.() -> Unit) {
    runBlocking {
        collect {
            it.test()
        }
    }
}

val testModule = module {
    single { TestContextProvider() as ThreadContextProvider }
}