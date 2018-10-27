package hackerrank.kotlin

fun main(args: Array<String>) {
    println(minimumNumber(1, "790"))
}

fun minimumNumber(n: Int, password: String): Int {
    var count = 0
    if (password.contains(Regex("[a-z]")).not()) count++
    if (password.contains(Regex("[A-Z]")).not()) count++
    if (password.contains(Regex("[0-9]")).not()) count++
    if (password.contains(Regex("[!@#\$%^&*()+]")).not() && password.contains("-").not()) count++
    return if (count+ password.length < 6) 6- password.length else count
}