package br.com.gmfonseca.resolutions.leetcode.problem3.solutions

import br.com.gmfonseca.resolutions.leetcode.problem3.AddTwoNumbersSolution
import br.com.gmfonseca.resolutions.leetcode.problem3.model.ListNode

class CheaperSolution : AddTwoNumbersSolution {
    override fun addTwoNumbers(firstNode: ListNode, secondNode: ListNode): ListNode? {
        val head = ListNode(0)
        var firstAux: ListNode? = firstNode
        var secondAux: ListNode? = secondNode
        var aux: ListNode = head
        var extra = 0

        do {
            val x = firstAux?.`val` ?: 0
            val y = secondAux?.`val` ?: 0
            val rest = (x + y + extra) % 10
            extra = (x + y + extra) / 10

            aux.next = ListNode(rest)

            firstAux = firstAux?.next
            secondAux = secondAux?.next
            aux = aux.next!!
        } while (firstAux != null || secondAux != null)

        if (extra != 0) {
            aux.next = ListNode(extra)
        }

        return head.next
    }
}
