package `2_KotlinBase`

class Person(
    val name: String,   //읽기 전용 프로퍼티로 비공개 필드와 필드를 읽는 단순한 게터를 만든다
    var isMarried: Boolean  //쓸수 있는 프로퍼티로 비공개 필드와 게터세터를 만들어낸다.
)

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get(){  //프로퍼티 게터 선언
            return height == width
        }
}

fun main(args: Array<String>){
    val rec = Rectangle(19,10)
    println(rec.isSquare)
}