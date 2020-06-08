import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().first()
    println(a.isUpperCase() || a in '1'..'9')
}
