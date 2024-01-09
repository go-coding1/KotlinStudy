package `2_KotlinBase`

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun main(){
    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for((letter,binary) in binaryReps){ //분해문법
        println("${letter} = ${binary}")
    }

    val list = arrayListOf("10","11","1001")
    for((index, element) in list.withIndex()){
        println("${index}: ${element}")
    }

    println(isLetter('q'))
}
