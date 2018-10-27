package hackerrank.kotlin

fun main(args: Array<String>) {
    minimumBribes(arrayOf(2, 1, 5, 3, 4))
}

fun minimumBribes(q: Array<Int>): Unit {
    var counter = 0

    for (i in q.size - 1 downTo 0) {
        if (q[i] - i - 1 > 2) {
            println("Too chaotic")
            return
        }
        for (j in Math.max(0, q[i] - 2) until i) {
            if (q[j] > q[i]) {
                counter++
            }
        }
    }
    println(counter)
}