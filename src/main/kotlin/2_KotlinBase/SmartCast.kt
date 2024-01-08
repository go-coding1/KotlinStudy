package `2_KotlinBase`

interface Expr  //Expr은아무 메소드도 선언하지 않으며,단지 여러 타입의 식 객체를 아우르는 공통 타입 역할만 수행한다.

class Num(val value: Int) : Expr    //value라는 프로퍼티만 존재하는 단순한 클래스로 Expr 인터페이스로 구현한다.
class Sum(val left: Expr, val right: Expr) : Expr   //Expr 타입의 객체라면 어떤 것이나 Sum 연산의 인자가 될 수 있다. 따라서 Num이나 다른 Sum이 인자로 올 수 있다.

fun eval(e: Expr): Int{
    if(e is Num) {
        val n = e as Num
        return n.value
    }
    if(e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")

}

fun eval2(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval2(e.left) + eval2(e.right)
        else -> throw IllegalArgumentException("Unknow expression")
    }

fun evalWithLogging(e: Expr): Int =
    when(e) {
        is Num -> {
            println("num : ${e.value}")
            e.value

        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: ${left} + ${right}")
            left+right
        }
        else -> throw IllegalArgumentException("Unknow expression")
    }
fun main(){
    print(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}
