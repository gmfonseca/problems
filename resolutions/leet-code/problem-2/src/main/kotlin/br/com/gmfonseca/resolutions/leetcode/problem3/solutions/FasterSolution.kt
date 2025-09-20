package br.com.gmfonseca.resolutions.leetcode.problem3.solutions

import br.com.gmfonseca.resolutions.leetcode.problem3.AddTwoNumbersSolution
import br.com.gmfonseca.resolutions.leetcode.problem3.model.ListNode

class FasterSolution : AddTwoNumbersSolution {
    override fun addTwoNumbers(firstNode: ListNode, secondNode: ListNode): ListNode {
        val result = mutableListOf<Int>()
        var extra = 0

        var firstAux: ListNode? = firstNode
        var secondAux: ListNode? = secondNode

        do {
            var sum: Int

            when {
                firstAux == null -> {
                    sum = secondAux!!.`val` + extra
                    secondAux = secondAux.next
                }
                secondAux == null -> {
                    sum = firstAux.`val` + extra
                    firstAux = firstAux.next
                }
                else -> {
                    sum = secondAux.`val` + firstAux.`val` + extra
                    firstAux = firstAux.next
                    secondAux = secondAux.next
                }
            }

            if (sum >= 10) {
                extra = 1
                sum -= 10
            } else {
                extra = 0
            }

            result.add(sum)
        } while (firstAux != null || secondAux != null)

        if (extra != 0) {
            result.add(extra)
        }

        return node(result)
    }

    private fun node(items: List<Int>): ListNode {
        val node = ListNode(items[0])
        var aux = node

        for (i in 1..items.lastIndex) {
            aux = aux.next(items[i])
        }

        return node
    }

    private fun ListNode.next(value: Int) = ListNode(value).also { next = it }
}
