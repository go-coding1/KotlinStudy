package `3_FuctionCall`

fun String.lastChar(): Char = this.get(this.length -1)
//확장 함수를 만들려면 추가하려는 하수 이름 앞에 그 함수가 확장할 클래스의 이름을 덧붙이기만 하면 된다.
//클래스 이름을 수신 객체 타입
//확장 함수가 호출되는 대상이 되는 값을 수신 객체라고 부른다.
//캡슐화가 깨지지는 않기 때문에 클래스 내부에서만 사용할 수 있는 private 멤버나 protected멤버를 사용할 수 없다.
fun main(){
    println("Kotlin".lastChar())
}