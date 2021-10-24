package br.com.gmfonseca.resolutions.leetcode.problem1

import org.junit.Test
import kotlin.test.assertEquals

abstract class TwoSumSolutionTest(private val solution: TwoSumSolution) {

    @Test
    fun `first example`() {
        val input = TwoSumInput(nums = intArrayOf(2, 7, 11, 15), target = 9)
        val expectedOutput = listOf(0, 1)

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput.toList())
    }

    @Test
    fun `second example`() {
        val input = TwoSumInput(nums = intArrayOf(3, 2, 4), target = 6)
        val expectedOutput = listOf(1, 2)

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput.toList())
    }

    @Test
    fun `third example`() {
        val input = TwoSumInput(nums = intArrayOf(3, 3), target = 6)
        val expectedOutput = listOf(0, 1)

        val actualOutput = solution.execute(input)

        assertEquals(expectedOutput, actualOutput.toList())
    }
}
