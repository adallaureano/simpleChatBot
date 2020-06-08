import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = scanner.next()
    val second = scanner.next()
    val third = scanner.next()
    println(first in second..third)
}
