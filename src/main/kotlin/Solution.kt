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

        var asciiTable = BooleanArray(127)
        var cursor = 0
        while (cursor < size) {
            var subStringCountTemp = 0
            var findCursor = cursor
            while (findCursor < size) {
                val asciiNumber = chars[findCursor].toInt()
                if (asciiTable[asciiNumber] == true) {
                    break
                }
                asciiTable[asciiNumber] = true
                subStringCountTemp++
                findCursor++
            }
            if (subStringCount < subStringCountTemp) {
                subStringCount = subStringCountTemp
            }
            asciiTable = BooleanArray(127)
            cursor++
        }
        return subStringCount
    }
}
