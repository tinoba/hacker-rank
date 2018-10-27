package hackerrank.kotlin

fun main(args: Array<String>) {
    println(pangrams("We promptly judged antique ivory buckles for the next prize"))
}

fun pangrams(s: String) =
        if (s.toLowerCase().toCharArray().distinct().count { it.isLetter() } == 26) "pangram" else "not pangram"
