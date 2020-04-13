package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var first: Int = 1
        var second: Int = 1
        var buffer: Int
        var isEqual: Int = 0
        while (first * second < n){
            buffer = first + second
            first = second
            second = buffer
        }
        if (first * second == n){
            isEqual = 1
        }
        return intArrayOf(first, second, isEqual)
    }
}
