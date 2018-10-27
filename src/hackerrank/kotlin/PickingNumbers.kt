package hackerrank.kotlin

fun main(args: Array<String>) {

    val a = "4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97"
    println(pickingNumbers(a.split(" ").map { it.toInt() }.toTypedArray()))
}

fun pickingNumbers(a: Array<Int>): Int {
    val map = a.groupingBy { it }.eachCount()
    var max = 0
    map.keys.forEach {
        if (map.contains(it + 1)) {
            val current = map[it]!! + map[it + 1]!!
            if (current > max) {
                max = current
            }
        }
    }
    return max
}