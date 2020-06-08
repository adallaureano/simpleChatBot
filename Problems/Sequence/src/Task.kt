import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var a = scanner.next().first()
    var b = scanner.next().first()
    val c = scanner.next().first()

    println(b == ++a && c == ++b)
}