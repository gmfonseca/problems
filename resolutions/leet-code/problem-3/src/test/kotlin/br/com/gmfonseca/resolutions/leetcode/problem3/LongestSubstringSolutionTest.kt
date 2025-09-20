package br.com.gmfonseca.resolutions.leetcode.problem3

import org.junit.Test
import kotlin.test.assertEquals

abstract class LongestSubstringSolutionTest(private val solution: LongestSubstringSolution) {

    @Test
    fun `first example`() {
        val input = "abcabcbb"
        val expectedOutput = 3

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `second example`() {
        val input = "bbbbb"
        val expectedOutput = 1

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `third example`() {
        val input = "pwwkew"
        val expectedOutput = 3

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `fourth example`() {
        val input = "aab"
        val expectedOutput = 2

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `fifth example`() {
        val input = "dvdf"
        val expectedOutput = 3

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput)
    }
}
