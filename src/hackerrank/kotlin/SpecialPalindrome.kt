package hackerrank.kotlin

fun main(args: Array<String>) {

    println(substrCount(7, "abcbaba"))
}

fun substrCount(n: Int, s: String): Long {
    var count = s.length
    var second = '0'

    var x = 0
    for (i in 0 until s.length) {
        if (x > 0) {
            x--
            continue
        }
        var counter = 0
        var first = s[i]
        for (j in i + 1 until s.length) {
            if (s[j] != first) {
                if (second != '0' && s[j] != second) {
                    second = '0'
                    break
                }
                counter++
                second = s[j]
            }
            val sub = s.substring(i, j + 1)
            if (isSpecialPalindrome(sub)) {
                count++
                if (sub[sub.length / 2] != sub[0]) {
                    second = '0'
                    if (counter > 1) {
                        x = j - i
                    }
                    break
                }
            }
        }
    }
    return count.toLong()
}

fun isSpecialPalindrome(s: String) = if (s.length % 2 == 0) s.all { it == s[0] } else s.removeRange(s.length / 2..s.length / 2).all { it == s[0] }