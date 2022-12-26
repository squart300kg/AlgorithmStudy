class Solution {
    fun solution(startString: String, targetString: String): Int {
        var answer = 0

        val tempStartString = StringBuilder(startString)
        repeat (startString.length) {
            if ("$tempStartString" != targetString) {
                answer++
                tempStartString.insert(0, tempStartString.takeLast(1)).deleteAt(tempStartString.length - 1)
            }
            else return answer
        }
        return -1
    }
}