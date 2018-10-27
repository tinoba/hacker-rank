package hackerrank.kotlin

fun main(args: Array<String>) {
    println(angryProfessor(2, arrayOf(0 ,-1, 2 ,1)))
}

fun angryProfessor(k: Int, a: Array<Int>) = if (a.filter { it <= 0 }.size >= k) "NO" else "YES"

