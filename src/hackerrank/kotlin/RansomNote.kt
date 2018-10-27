package hackerrank.kotlin

fun main(args: Array<String>) {
    checkMagazine(arrayOf("two", "times", "three", "is", "not", "four"),
            arrayOf("two", "times", "two", "is", "four"))
}

fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {

    val strings: MutableMap<String, Int> = magazine.groupingBy { it }.eachCount().toMutableMap()

    for (s in note) {
        if (strings.containsKey(s)) {
            if (strings[s]!! > 0) {
                strings[s] = strings[s]!! - 1
            }else{
                println("No")
                return
            }
        }else{
            println("No")
            return
        }
    }
    println("Yes")
}