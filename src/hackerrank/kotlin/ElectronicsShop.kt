package hackerrank.kotlin

fun main(args: Array<String>) {
    println(getMoneySpent(arrayOf(5), arrayOf(4), 5))
}

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var total = -1
    for (keyboard in keyboards.sortedDescending()) {
        for (drive in drives.sorted()) {
            val current = keyboard + drive
            if (current > b) break
            if (current > total) {
                total = current
            }
        }
    }
    return total
}