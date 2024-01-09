package `2_KotlinBase`

import java.io.BufferedReader
import java.io.StringReader

//val percentage =
//    if(number in 0..100) number
//    else
//        throw IllegalArgumentException("A percetnage value must be between 0and 100: $number")

fun readNumber (reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }
}



fun main(){
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}