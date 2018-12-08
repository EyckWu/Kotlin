package com.eyck.chap2

open class C{
    fun foo(){
        println("base")
    }
}

class D: C()

fun C.foo() = "c"
fun C.foo(i: Int) { println("extension") }

fun D.foo() = "d"

fun printFoo(c: C){
    println(c.foo())
    println(c.foo(1))
}

fun main(args: Array<String>){
    printFoo(D())
}