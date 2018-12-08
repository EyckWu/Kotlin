package com.eyck.chap2

fun cal(a: Int, b: Int, operation: (Int, Int) -> Int): Int{
    return operation(a, b)
}

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b

fun operation(): (Int) -> Int{
    return ::square
}

fun square(a: Int): Int{
    return a * a
}

fun main(args:Array<String>){
    println(cal(2, 3, ::sum))
    println(cal(2, 3, ::mul))
    println(cal(5, 3){a, b -> a - b})
    val func = operation()
    println(func(2))
}

