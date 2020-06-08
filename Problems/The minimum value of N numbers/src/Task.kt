import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val quantity = scanner.nextInt()
    var min = Int.MAX_VALUE

    repeat(quantity) {
        val number = scanner.nextInt()
        if (number < min) min = number
    }
    print(min)
}
/*
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val arr = IntArray(n)
    for (i in 1..n) {
        arr[i - 1] = scanner.nextInt()
    }
    print(arr.min())
}

    val scanner = Scanner(System.`in`)
    var min = Int.MAX_VALUE

    val n = scanner.nextInt()
    for (i in 1..n) {
        val number = scanner.nextInt()
        if ( number < min) min = number
    }
    print(min)
 */