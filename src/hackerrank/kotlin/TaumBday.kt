package hackerrank.kotlin

fun main(args: Array<String>) {
    println(taumBday(27984, 1402,
            619246, 615589, 247954))
}

fun taumBday(b: Int, w: Int, bc: Int, wc: Int, z: Int): Long {
    val diff = Math.abs(bc - wc)
    if (bc > wc && diff > z) return (wc + z) * b.toLong() + wc * w.toLong()
    else return if (bc < wc && diff > z) (bc + z) * w.toLong() + bc * b.toLong()
    else if (bc == wc) (b + w) * bc.toLong()
    else bc * b.toLong() + wc * w.toLong()
}