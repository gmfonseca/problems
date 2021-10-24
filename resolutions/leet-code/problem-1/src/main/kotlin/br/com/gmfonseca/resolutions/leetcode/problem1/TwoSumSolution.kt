package br.com.gmfonseca.resolutions.leetcode.problem1

import br.com.gmfonseca.core.Solution

interface TwoSumSolution : Solution<TwoSumInput, IntArray> {
    fun twoSum(nums: IntArray, target: Int): IntArray

    override fun execute(input: TwoSumInput): IntArray = twoSum(input.nums, input.target)
}
