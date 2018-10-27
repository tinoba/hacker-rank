package hackerrank.kotlin

fun main(args: Array<String>) {
    permutationEquation(arrayOf(4, 3, 5, 1, 2)).forEach { println(it) }
}

fun permutationEquation(p: Array<Int>) =
        p.mapIndexed { index, _ -> p.indexOf(p.indexOf(index + 1) + 1) + 1 }.toTypedArray()