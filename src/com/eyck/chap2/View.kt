package com.eyck.chap2

open class View {
    constructor(a: Int): this(a, 0)
    constructor(a: Int, b: Int): this(a, b, 0)
    constructor(a: Int, b: Int, c: Int){
        println("a is $a, b is $b, c is $c")
    }
}