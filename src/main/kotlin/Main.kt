fun main() {
    val a: Int = readLine()!!.toInt()
    for (i in 0 until a)
    {
        for (j in 0..a - i)
        {
            print("  ")
        }
        for (j in 0..i * 2)
        {
            print("* ")
        }
//        println(i)
    }

}