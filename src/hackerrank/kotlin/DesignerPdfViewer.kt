package hackerrank.kotlin

fun main(args: Array<String>) {
    println(designerPdfViewer(arrayOf(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7),
            "zaba"))
}

fun designerPdfViewer(h: Array<Int>, word: String): Int {

    val map = mutableMapOf<Char, Int>()
    h.forEachIndexed { index, i -> map[(index + 'a'.toInt()).toChar()] = i }
    var max = 0

    word.forEach {
        val new = map[it]
        if (new!! > max) {
            max = new
        }
    }
    return word.length * max
}