import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val sequence = scanner.nextInt()
    var count = 0

    repeat(sequence) {
        val number = scanner.nextInt()
            if (number > 0) count++
    }
    print(count)
}