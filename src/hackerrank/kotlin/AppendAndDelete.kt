package hackerrank.kotlin

fun main(args: Array<String>) {
    println(appendAndDelete("abcdef", "fedcba", 15))
}

fun appendAndDelete(s: String, t: String, k: Int): String {
    var commonLength = 0

    for (i in 0 until java.lang.Math.min(s.length, t.length)) {
        if (s[i] == t[i])
            commonLength++
        else
            break
    }
    return when {
        s.length + t.length - 2 * commonLength > k -> "No"
        (s.length + t.length - 2 * commonLength) % 2 == k % 2 -> "Yes"
        s.length + t.length - k < 0 -> "Yes"
        else -> "No"
    }
}