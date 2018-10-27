package hackerrank.kotlin

fun main(args: Array<String>) {
    println(superReducedString("abbba"))
}

fun superReducedString(s: String): String {
    for (i in 0 until s.length-1) {
        if (s[i] == s[i+1]){
            return superReducedString(s.removeRange(i..i+1))
        }
    }
    return if (s.isEmpty()) "Empty String" else s
}