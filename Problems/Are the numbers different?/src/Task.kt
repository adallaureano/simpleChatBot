import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()

    println(a != b && b != c && a != c)
}
/*
 println(!(b in a..c))
  println(!(a == b || b == c))
 */