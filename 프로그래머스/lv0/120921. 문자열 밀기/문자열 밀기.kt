class Solution {
    fun solution(startString: String, targetString: String): Int {
        val tempStartString = StringBuilder(startString)
        repeat (startString.length) {
            if ("$tempStartString" != targetString) {
                tempStartString.insert(0, tempStartString.takeLast(1)).deleteAt(tempStartString.length - 1)
            }
            else return it
        }
        return -1
    }
}