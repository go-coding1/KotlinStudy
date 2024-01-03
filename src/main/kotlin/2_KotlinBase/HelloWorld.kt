//이걸 선언해야 밑에 main 함수를 실행 가능
class HelloWorld

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(1,2))
}

//fun max(a: Int,b: Int) : Int {
//    return if (a > b) a else b
//}
//중괄호를 없애고
//return을 제거하면서
//등호를식 앞에 붙이면 더 간결하게 함수 표현 가능
fun max(a: Int,b: Int) : Int
    = if (a > b) a else b

