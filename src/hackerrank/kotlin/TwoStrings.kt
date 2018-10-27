package hackerrank.kotlin

fun main(args: Array<String>) {
    println(twoStrings("hello", "world"))
}

fun twoStrings(s1: String, s2: String) = if (s1.toSet().intersect(s2.toSet()).isEmpty()) "NO" else "YES"
