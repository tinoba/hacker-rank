package hackerrank.kotlin

fun main(args: Array<String>) {
    println(saveThePrisoner(3, 7, 3))
}

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val place = (m+s-1)% n
    return if(place == 0) n else place
}