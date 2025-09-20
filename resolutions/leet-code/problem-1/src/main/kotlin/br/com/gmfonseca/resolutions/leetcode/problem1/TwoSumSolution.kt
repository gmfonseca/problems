package br.com.gmfonseca.resolutions.leetcode.problem1

import br.com.gmfonseca.core.Solution

interface TwoSumSolution : Solution<TwoSumInput, IntArray> {
    fun twoSum(nums: IntArray, target: Int): IntArray

    override fun execute(input: TwoSumInput): IntArray = twoSum(input.nums, input.target)
}


// TODO - check this later: reverse a LinkedList using recursion, is that possible?
fun test() {
    val list = listOf("foo", "bar", "?")

    fun reverse(input: List<String>, result: List<String>) {

    }
}