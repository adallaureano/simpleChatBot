import java.util.*

// write your function here
fun isGreater(a: Int, b: Int, c: Int, d: Int): Boolean {
    var result = false
    result = a + b > c + d
    return result
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}
/*
fun isGreater(a: Int, b: Int, c: Int, d: Int): Boolean{
    return if (a + b > c + d) {
        println("true")
    } else {
        println("false")
    }
}
 */