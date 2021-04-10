class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        return findMaxLengthOfSubString(s.toCharArray())
    }

    private fun findMaxLengthOfSubString(chars: CharArray): Int {

        val size = chars.size
        var subStringCount = 0

        if (size == 0) {
            return subStringCount
        }

        var asciiTable = IntArray(128)
        var cursor = 0
        while (cursor < size) {
            var subStringCountTemp = 0
            var findCursor = cursor
            while (findCursor < size) {
                val asciiNumber = chars[findCursor].toInt()
                if (asciiTable[asciiNumber] == 1) {
                    break
                }
                asciiTable[asciiNumber] = 1
                subStringCountTemp++
                findCursor++
            }
            if (subStringCount < subStringCountTemp) {
                subStringCount = subStringCountTemp
            }
            asciiTable = IntArray(128)
            cursor++
        }
        return subStringCount
    }
}
