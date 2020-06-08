import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()
    var count = 0

    for (a in a..b step n) {
        if (a % n == 0 || b % n == 0 ||  n % n == 0) { count++ }
    }
    println(count)
}
/*
    for (i in a..b step n) {
        if (a % n == 0) { count++ }
        if (b % n == 0) { count++ }
        if (n % n == 0) { count++ }
    }
----
    if (a % n == 0 && a != n) { count++ }
    if (b % n == 0 && b != n) { count++ }
    if (n % n == 0) { count++ }
    println(count)
 */