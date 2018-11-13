package com.eyck.chap1

fun sum(a: Int, b: Int): Int{
    return a + b;
}

fun sum1(a: Int, b: Int) = a + b

fun main(args: Array<String>){
    println(sum(2, 3))
    println(sum(3, 4))
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
