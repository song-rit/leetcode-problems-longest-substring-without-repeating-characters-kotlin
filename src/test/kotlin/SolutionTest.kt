import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class SolutionTest {
    private val solution = Solution()

    companion object {
        @JvmStatic
        fun testArguments(): Stream<Arguments> = Stream.of(
            Arguments.of("abcabcbb!", 3),
            Arguments.of("bbbbb", 1),
            Arguments.of("pwwkew", 3),
            Arguments.of("", 0),
            Arguments.of("s", 1),
            Arguments.of("test", 3)
        )
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    fun `solution test`(case: String, expected: Int) {
        Assertions.assertEquals(solution.lengthOfLongestSubstring(case), expected)
    }
}
