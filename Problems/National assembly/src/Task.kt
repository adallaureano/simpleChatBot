import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val res = Math.cbrt(number.toDouble())
    print(res.toInt())
}