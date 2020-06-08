import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()

    println(b in c..a || b in a..c)
}