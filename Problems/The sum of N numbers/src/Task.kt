import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0
    for (i in 1..n) {
        val number = scanner.nextInt()
        sum += number
    }
    println(sum)
}
/*
    repeat(n) {
        var number = scanner.nextInt()
        result = number + number
    }
    println(result)
 */