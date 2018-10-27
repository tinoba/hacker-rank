package hackerrank.kotlin

fun main(args: Array<String>) {
    println(countingValleys(8, "UDDDUDUU"))
}

fun countingValleys(n: Int, s: String): Int {
    var position = 0
    var valleys = 0
    for (c in s) {
        if (c == 'D') {
            position--
        } else {
            if (position == -1) {
                valleys++
            }
            position++
        }
    }
    return valleys
}