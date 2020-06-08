import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    val e = scanner.nextInt()
    println(e in a..b && e in c..d)
}
/*
    val num = scanner.nextLine()
            .split(" ")
            .map { it.toInt() }

    println(num.last() in num[0]..num[1] && num.last() in num[2]..num[3])
 */