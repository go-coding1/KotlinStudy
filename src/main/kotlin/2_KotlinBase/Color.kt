package `2_KotlinBase`

enum class Color(
    val r: Int,val g: Int, val b: Int //상수의 프로퍼티를 정의한다.
) {
    RED(255, 0, 0), ORANGE(255,165,0),  //각 상수를 생성할때 그에 대한 프로퍼티 값을 지정한다.
    YELLOW(255,255,0), GREEN(0,255,0),
    BLUE(0,0,255), INDIGO(75,0,130), VIOLET(238,130,238);   //여기 반드시 세미콜론을사용해야 한다.
}

fun getMnemonic(color: Color) =
    when (color){
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(c1:Color,c2: Color) =
    when {
        (c1 == Color.RED && c2 ==Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
        else -> throw Exception("Dirty Color")
    }
fun main(array: Array<String>){
    print(mix(Color.BLUE, Color.YELLOW))
    print(mixOptimized(Color.BLUE, Color.YELLOW))
}