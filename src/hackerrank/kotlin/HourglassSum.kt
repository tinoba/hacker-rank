package hackerrank.kotlin

fun main(args: Array<String>) {
    println(hourglassSum(arrayOf(
            arrayOf(-1, -1 ,0, -9, -2 ,-2),
            arrayOf(-2 ,-1, -6, -8, -2, -5),
            arrayOf(-1 ,-1 ,-1, -2, -3 ,-4),
            arrayOf(-1, -9 ,-2, -4 ,-4 ,-5),
            arrayOf(-7, -3, -3 ,-2, -9, -9),
            arrayOf(-1 ,-3, -1, -2 ,-4, -5))
    ))
}

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var sum = Integer.MIN_VALUE
    for (i in 0..3) {
        for (j in 0..3) {
            val newSum = arr[i][j]+ arr[i][j+1]+ arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]
            if (sum < newSum){
                sum = newSum
            }
        }
    }
    return sum
}