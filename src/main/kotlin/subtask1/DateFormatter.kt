package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.format.ResolverStyle
import java.util.*

class DateFormatter {
    private val INPUT_FORMAT =
        DateTimeFormatter.ofPattern("uuuu/M/d").withResolverStyle(ResolverStyle.STRICT)

    private val OUTPUT_FORMAT =
        DateTimeFormatter.ofPattern("d MMMM, EEEE", Locale("ru"))

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            return LocalDate.parse("$year/$month/$day", INPUT_FORMAT).format(OUTPUT_FORMAT)
        } catch (e: DateTimeParseException) {
            "Такого дня не существует"
        }
    }
}

