package hackerrank.kotlin

fun main(args: Array<String>) {
    println(queensAttack(5, 3, 4, 3,
            arrayOf(arrayOf(5, 5),
                    arrayOf(4, 2),
                    arrayOf(2, 3))))
}

fun queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array<Array<Int>>): Int {
    var total = 0

    for (i in c_q + 1..n) {
        if (obstacles.none { it[0] == r_q && it[1] == i }) {
            total++
        } else {
            break
        }
    }
    for (i in r_q + 1..n) {
        if (obstacles.none { it[0] == i && it[1] == c_q }) {
            total++
        } else {
            break
        }
    }
    for (i in c_q - 1 downTo 1) {
        if (obstacles.none { it[0] == r_q && it[1] == i }) {
            total++
        } else {
            break
        }
    }
    for (i in r_q - 1 downTo 1) {
        if (obstacles.none { it[0] == i && it[1] == c_q }) {
            total++
        } else {
            break
        }
    }

    var j = c_q + 1
    for (i in r_q + 1..n) {
        if (j > n || i > n) {
            break
        }
        if (obstacles.none { it[0] == i && it[1] == j }) {
            total++
        } else {
            break
        }
        j++
    }
    j = c_q -1
    for (i in r_q + 1..n) {
        if (j <1 || i > n) {
            break
        }
        if (obstacles.none { it[0] == i && it[1] == j }) {
            total++
        } else {
            break
        }
        j--
    }

    j = c_q -1
    for (i in r_q - 1 downTo 1) {
        if (j <1 || i < 1) {
            break
        }
        if (obstacles.none { it[0] == i && it[1] == j }) {
            total++
        } else {
            break
        }
        j--
    }

    j = c_q +1
    for (i in r_q - 1 downTo 1) {
        if (j >n || i < 1) {
            break
        }
        if (obstacles.none { it[0] == i && it[1] == j }) {
            total++
        } else {
            break
        }
        j++
    }


    return total
}