package br.com.gmfonseca.resolutions.leetcode.problem3

import br.com.gmfonseca.core.Solution
import br.com.gmfonseca.resolutions.leetcode.problem3.model.AddTwoNumbersInput
import br.com.gmfonseca.resolutions.leetcode.problem3.model.ListNode

interface AddTwoNumbersSolution : Solution<AddTwoNumbersInput, ListNode?> {
    fun addTwoNumbers(firstNode: ListNode, secondNode: ListNode): ListNode?

    override fun execute(input: AddTwoNumbersInput): ListNode? = addTwoNumbers(input.firstNode, input.secondNode)
}
