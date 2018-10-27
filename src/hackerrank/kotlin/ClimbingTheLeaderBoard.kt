package hackerrank.kotlin

fun main(args: Array<String>) {
    println(climbingLeaderboard(arrayOf(100, 100, 50, 40, 40, 20, 10), arrayOf(5, 25, 50, 120)))
}

fun climbingLeaderboard(scores: Array<Int>, alice: Array<Int>): Array<Int> {
    val list = mutableListOf<Int>()

    val map = scores.groupingBy { it }.eachCount().keys
    for (i in alice) {
        list.add(map.filter { it > i }.size + 1)
    }

    return list.toTypedArray()
}