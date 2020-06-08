import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(
            if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
        "Leap"
    } else {
        "Regular"
    })
}