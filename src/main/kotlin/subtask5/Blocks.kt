package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class -> {
                var result: Int = 0
                for (i in blockA) {
                    if (i is Int) {
                        result += i
                    }
                }
                return result
            }
            String::class -> {
                val result = StringBuilder()
                for (i in blockA) {
                    if (i is String) {
                        result.append(i)
                    }
                }
                return result.toString()
            }
            LocalDate::class -> {
                var result = LocalDate.MIN
                for (i in blockA) {
                    if (i is LocalDate && i > result) {
                        result = i
                    }
                }
                return result.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
            else -> throw UnsupportedOperationException("getData() in not implemented for $blockB")
        }
    }
}
