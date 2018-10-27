package hackerrank.kotlin

fun main(args: Array<String>) {
    println(catAndMouse(1, 2, 3))
}

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val a = Math.abs(z - x)
    val b = Math.abs(z - y)
    if (a < b) {
        return "Cat A"
    } else if (a > b) {
        return "Cat B"
    }
    return "Mouse C"
}