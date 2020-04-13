package subtask4

class Pangram {

    private val alphabet: CharRange = 'a'..'z'
    private var vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val resultSentence = StringBuilder()
        convertSentence(inputString).sortedBy { pair -> pair.first }.forEach { pair ->
            if (pair.second.isNotEmpty()) {
                resultSentence.append("${pair.first}${pair.second} ")
            }
        }
        return resultSentence.toString().trim()
    }

    private fun convertSentence(sentence: String): List<Pair<Int, String>> {
        val isPangram: Boolean = isPangram(sentence)
        val words = sentence.replace("\n", "").split(" ")
        val resultWordsList = mutableListOf<Pair<Int, String>>()
        words.forEach { word: String ->
            var vowelsOrConsonantsCount = 0
            val camelcaseWord = StringBuilder()
            word.toCharArray().forEach { char: Char ->
                val lowerCaseChar = char.toLowerCase()
                if ((isPangram && lowerCaseChar in vowels) || (!isPangram && lowerCaseChar in alphabet && lowerCaseChar !in vowels)) {
                    vowelsOrConsonantsCount++
                    camelcaseWord.append(char.toUpperCase())
                } else {
                    camelcaseWord.append(char)
                }
            }
            resultWordsList.add(vowelsOrConsonantsCount to camelcaseWord.toString())
        }
        return resultWordsList
    }

    private fun isPangram(string: String): Boolean {
        val testStr = string.toLowerCase()
        alphabet.forEach { letter: Char ->
            if (letter !in testStr) {
                return false
            }
        }
        return true
    }
}
