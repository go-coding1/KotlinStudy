package `3_FuctionCall`

//디폴트 파라미터 값을사용해 joinToString() 정의하기

fun <T> joinToStringWithDefault(
    collection: Collection<T>,
    separator: String=", ",
    prefix: String="",
    postfix: String=""
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()){
        if(index>0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    val set = hashSetOf(1,7,23) //숫자로 이뤄진 집합

    val list = arrayListOf(1,7,53)  //숫자로 이뤄진 리스트
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")  //to는 일반 함수

    println(joinToStringWithDefault(list,", ", "",""))

    println(joinToStringWithDefault(list))

    println(joinToStringWithDefault(list,"; "))

    println(joinToStringWithDefault(list, postfix = ";", prefix = "#"))
}