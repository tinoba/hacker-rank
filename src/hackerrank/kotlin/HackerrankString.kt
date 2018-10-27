package hackerrank.kotlin

fun main(args: Array<String>) {
    println(hackerrankInString("hhaacckkekraraannk"))
}

fun hackerrankInString(s: String) = if (s.contains(Regex(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k"))) "YES" else "NO"
