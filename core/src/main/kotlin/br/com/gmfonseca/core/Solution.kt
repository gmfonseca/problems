package br.com.gmfonseca.core

fun interface Solution<in Input, out Output> {
    fun execute(input: Input): Output
}
