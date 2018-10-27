package hackerrank.kotlin

fun main(args: Array<String>) {

    println(isValid("aabbc"))
}

fun isValid(s: String): String {

    val map = s.groupingBy { it }.eachCount()

    var last : Int
    if (s.length > 1){
        val first : Int = map.get(s[0])!!
        val second = map.get(s[1])!!
        last = if (first < second) first else second
    }else{
        return "YES"
    }

    map.values.all { it == last }
    if (map.values.filter { it < last || it > last + 1 }.isNotEmpty()){
        return "NO"
    }

    return if (map.values.filter { it == last+1}.size > 1) "NO" else "YES"

}