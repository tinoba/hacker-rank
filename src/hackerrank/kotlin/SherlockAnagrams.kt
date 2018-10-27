package hackerrank.kotlin

fun main(args: Array<String>) {
    println(sherlockAndAnagrams("abba"))
}

fun sherlockAndAnagrams(s: String): Int {

    var ans = 0
    for (len in 1..s.length) {
        for (i in 0..s.length - len) {
            loop@ for (j in i + 1..s.length - len) {
                val h1 = s.substring(i, i + len)
                val h2 = s.substring(j, j + len)
                val c = IntArray(26)
                for (w in h1) {
                    c[w - 'a']++
                }
                for (w in h2) {
                    if (c[w - 'a'] > 0) c[w - 'a']--
                    else continue@loop
                }
                ans++
            }
        }
    }
    return ans
}