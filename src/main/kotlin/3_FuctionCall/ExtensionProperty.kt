package `3_FuctionCall`

val String.lastChar: Char
    get() = get(length-1)

var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }

fun main(){
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb.toString())
}