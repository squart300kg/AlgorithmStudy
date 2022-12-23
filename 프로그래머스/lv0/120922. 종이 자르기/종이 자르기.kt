class Solution {

    var cuttingCount = 0

    fun solution(row: Int, width: Int): Int {
        val (paperRowSize, paperWitdhSize) = Pair(2 * row - 1, 2 * width - 1)
        val paperArray = Array(paperRowSize) { IntArray(paperWitdhSize) }

        calculateCuttingCount(paperArray)

        return cuttingCount
    }

    fun calculateCuttingCount(paperArray: Array<IntArray>) {
        val (longerSizes, shorterSizes) = Pair(Math.max(paperArray.size, paperArray.first().size), Math.min(paperArray.size, paperArray.first().size))

        if (longerSizes == 1 && shorterSizes == 1) return

        for (shorterIndex in 1 until shorterSizes step 2) {
            for (longerIndex in 0 until longerSizes) {

                if (longerSizes == paperArray.size) {
                    paperArray[longerIndex][shorterIndex] = 1
                } else {
                    paperArray[shorterIndex][longerIndex] = 1
                }

                if (longerIndex == longerSizes.minus(1)) {
                    cuttingCount++

                }
            }
        }

        for (longerIndex in 1 until longerSizes step 2) {
            for (shorterIndex in 0 until shorterSizes) {

                if (longerSizes == paperArray.size) {
                    if (paperArray[longerIndex][shorterIndex] == 0) {
                        paperArray[longerIndex][shorterIndex] = 1
                        cuttingCount++
                    }
                } else {
                    if (paperArray[shorterIndex][longerIndex] == 0) {
                        paperArray[shorterIndex][longerIndex] = 1
                        cuttingCount++
                    }
                }
            }
        }

    }
}