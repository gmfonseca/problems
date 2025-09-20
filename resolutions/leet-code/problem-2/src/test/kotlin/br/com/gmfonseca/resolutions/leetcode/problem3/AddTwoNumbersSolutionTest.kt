package br.com.gmfonseca.resolutions.leetcode.problem3

import br.com.gmfonseca.resolutions.leetcode.problem3.model.AddTwoNumbersInput
import br.com.gmfonseca.resolutions.leetcode.problem3.model.ListNode
import org.junit.Test
import kotlin.test.assertEquals

abstract class AddTwoNumbersSolutionTest(private val solution: AddTwoNumbersSolution) {

    @Test
    fun `first example`() {
        val input = AddTwoNumbersInput(
            firstNode = ListNode(2, 4, 3),
            secondNode = ListNode(5, 6, 4),
        )
        val expectedOutput = ListNode(7, 0, 8).toString()

        val actualOutput = solution.execute(input).toString()

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `second example`() {
        val input = AddTwoNumbersInput(
            firstNode = ListNode(0),
            secondNode = ListNode(0),
        )
        val expectedOutput = ListNode(0).toString()

        val actualOutput = solution.execute(input).toString()

        assertEquals(expectedOutput, actualOutput)
    }

    @Test
    fun `third example`() {
        val input = AddTwoNumbersInput(
            firstNode = ListNode(9, 9, 9, 9, 9, 9, 9),
            secondNode = ListNode(9, 9, 9, 9),
        )
        val expectedOutput = ListNode(8, 9, 9, 9, 0, 0, 0, 1).toString()

        val actualOutput = solution.execute(input).toString()

        assertEquals(expectedOutput, actualOutput)
    }
}
