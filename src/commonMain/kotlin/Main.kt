import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun main(args: Array<String>) {
    val year = when (args.size) {
        0 -> Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault()).year
        1 -> args[0].toInt()
        else -> throw IllegalArgumentException("Too many arguments")
    }
    println("Starting generation for year $year")
    for (month in 1..12) {
        for (day in 1..31) {
            println("generating day : $month-$day")
        }
    }

}