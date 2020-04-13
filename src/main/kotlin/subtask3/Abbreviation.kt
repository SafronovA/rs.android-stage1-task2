package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var listA = a.toUpperCase().toMutableList()
        val listB = b.toMutableList()
        return if (listA.intersect(listB).toMutableList() == listB) {
            "YES"
        } else {
            "NO"
        }
    }
}
