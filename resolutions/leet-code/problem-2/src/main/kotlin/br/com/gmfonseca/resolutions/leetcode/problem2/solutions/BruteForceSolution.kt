package br.com.gmfonseca.resolutions.leetcode.problem2.solutions

import br.com.gmfonseca.resolutions.leetcode.problem2.AddTwoNumbersSolution
import br.com.gmfonseca.resolutions.leetcode.problem2.model.ListNode

class BruteForceSolution : AddTwoNumbersSolution {
    override fun addTwoNumbers(firstNode: ListNode, secondNode: ListNode): ListNode {
        lateinit var result: ListNode
        var aux: ListNode? = null
        var extra = 0

        var firstAux: ListNode? = firstNode
        var secondAux: ListNode? = secondNode

        do {
            var sum = firstAux.value() + secondAux.value() + extra

            if (sum >= 10) {
                extra = 1
                sum -= 10
            } else {
                extra = 0
            }

            if (aux != null) {
                aux = aux.next(sum)
            } else {
                result = ListNode(sum)
                aux = result
            }

            if (firstAux != null) {
                firstAux = firstAux.next
            }
            if (secondAux != null) {
                secondAux = secondAux.next
            }
        } while (firstAux != null || secondAux != null)

        if (extra != 0) {
            aux!!.next = ListNode(extra)
        }

        return result
    }

    private fun ListNode.next(value: Int) = ListNode(value).also { next = it }

    private fun ListNode?.value() = this?.`val` ?: 0
}
