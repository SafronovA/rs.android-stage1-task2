package subtask2

class TimeConverter {
    private val minutes = arrayOf(
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen",
        "twenty",
        "twenty one",
        "twenty two",
        "twenty three",
        "twenty four",
        "twenty five",
        "twenty six",
        "twenty seven",
        "twenty eight",
        "twenty nine",
        "thirty"
    )

    private val hours = arrayOf(
        "zero",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve"
    )

    fun toTextFormat(hour: String, minute: String): String {
        val hourInt = hour.toInt()
        val minuteInt = minute.toInt()
        return when (minuteInt) {
            0 -> "${hours[hourInt]} o' clock"
            1 -> "one minute past ${hours[hourInt]}"
            15 -> "quarter past ${hours[hourInt]}"
            30 -> "half past ${hours[hourInt]}"
            45 -> "quarter to ${hours[hourInt + 1]}"
            59 -> "one minute to ${hours[hourInt + 1]}"
            in 2..30 -> "${minutes[minuteInt - 1]} minutes past ${hours[hourInt]}"
            in 31..59 -> "${minutes[60 - minuteInt - 1]} minutes to ${hours[hourInt + 1]}"
            else -> ""
        }
    }
}

