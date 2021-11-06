package br.com.gmfonseca.resolutions.leetcode.problem2.model

data class ListNode(var `val`: Int) {
    var next: ListNode? = null

    private fun next(value: Int) = ListNode(value).also { next = it }

    override fun toString(): String = if (next != null) "$`val`, $next" else "$`val`"

    companion object {
        operator fun invoke(initial: Int, vararg others: Int) = ListNode(initial).apply {
            var aux: ListNode = this

            others.forEach { value ->
                aux = aux.next(value)
            }
        }
    }
}
