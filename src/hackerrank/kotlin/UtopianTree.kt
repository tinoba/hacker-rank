package hackerrank.kotlin

fun main(args: Array<String>) {
    println(utopianTree(5))
}

fun utopianTree(n: Int): Int {
    var tree = 1

    for (i in 0 until n) {
        if (i % 2 == 0) {
            tree *= 2
        } else {
            tree++
        }
    }
    return tree
}