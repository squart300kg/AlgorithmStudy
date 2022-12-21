class Solution {
    
    fun solution(num: Int, total: Int): IntArray {
        val startArray = 
        if (num % 2 == 0) mutableListOf(total / num, total / num + 1) 
        else mutableListOf(total/num)
        
        val repeatCount = if (num % 2 == 0) num / 2 - 1 else num / 2

        repeat(repeatCount) { index ->
            if (startArray.add(startArray.first() - 1)) startArray.sort()


            if (startArray.add(startArray.last() + 1))startArray.sort()

        }

        return startArray.toIntArray()
    }
}