package com.adrielvieira.ch1

// operadores simples

fun main() {
    println(5 + 5) // adição
    println(12 - 2) // subtração
    println(5 * 2) // multiplicação
    println(20 / 2) // divisão

    println(22.0 / 7.0) // decimal

    println( 28 % 10)  // resto
    println(28.0 % 10.0)

    println("%.0f" .format(28.0 % 10.0))

    /*
        //Shift left: shl
        //Shift right: shr
    * são funções infixas que você coloca entre os
    * operadores para que a chamada da função pareça uma
    * operação.
    * */

    println(1 shl 3) // facilita a multiplicação ou divisão por potências de dois.
    println(32 shr 2)
}