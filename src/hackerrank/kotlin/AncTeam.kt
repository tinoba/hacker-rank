package hackerrank.kotlin

fun main(args: Array<String>) {
    acmTeam(arrayOf("10101",
            "11100",
            "11010",
            "00101"))
            .forEach { println(it) }
}

fun acmTeam(topic: Array<String>): Array<Int> {
    var max = 0
    var max2 = 0

    for (i in 0 until topic.size) {
        for (j in i + 1 until topic.size) {
            val current = (topic[i].toInt() + topic[j].toInt()).toString().count { it != '0' }
            if (current > max) {
                max = current
                max2 = 1
            } else if (current == max) {
                max2++
            }
        }
    }
    return arrayOf(max, max2)
}