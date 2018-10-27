package hackerrank.kotlin

fun main(args: Array<String>) {
    cutTheSticks(arrayOf(1, 2, 3, 4, 3, 3, 2, 1)).forEach { println(it) }
}

fun cutTheSticks(arr: Array<Int>): Array<Int> {

    val array = mutableListOf<Int>()
    array.add(arr.size)
    val a = arr.toMutableList()
    while (true){
        val min = a.min()!!
        val max = a.max()!!
        if (max >0 && max > min){
            for (i in 0 until a.size) {
                if (a[i] == min){
                    a[i] = 0
                }else {
                    a[i] -= min
                }
            }

            a.removeIf { it <= 0 }

            array.add(a.filter { it >0 }.size)

        }else{
            return array.toTypedArray()
        }
    }
}