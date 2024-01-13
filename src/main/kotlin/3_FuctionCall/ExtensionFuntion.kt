package `3_FuctionCall`

//확장함수로 jointToString함수의 최종 버전 작성

fun <T> Collection<T>.joinToString( //-> Collection<<T> 에 대한 확장함수를 정의한다.
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in  this.withIndex()){
        if(index>0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

//문자열 컬렉션에 대해서만 호출할 수 있는 join() 함수를 정의함
fun Collection<String>.join(
    separator: String=", ",
    prefix: String ="",
    postfix: String=""
) = joinToString(separator,prefix,postfix)

//확장함수는 정적 메소드와 같은 특징을 가지므로 확장함수를 하위 클래스에서 오버라이드 불가능하다.
fun main(){
    val list = listOf(1,2,3)
    println(list.joinToString(separator = "; ",
        prefix="(",
        postfix=")"))

    println(listOf("one","two","three").join())

    val view: View = Button()
    view.click()
    view.showOff()
}

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I am a View")
fun Button.showOff() = println("I am a Button")

//코틀린은 호출될 확장 함수를 정적으로 결정하기 때문에