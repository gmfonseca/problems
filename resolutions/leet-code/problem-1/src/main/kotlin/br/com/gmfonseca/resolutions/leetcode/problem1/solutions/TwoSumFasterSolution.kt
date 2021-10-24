package br.com.gmfonseca.resolutions.leetcode.problem1.solutions

import br.com.gmfonseca.resolutions.leetcode.problem1.TwoSumSolution
import java.util.NoSuchElementException

class TwoSumFasterSolution : TwoSumSolution {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        val visited = hashMapOf<Int, Int>()

        for ((i, value) in nums.withIndex()) {
            val missing = target - value

            if (visited.contains(missing)) {
                return intArrayOf(visited.getValue(missing), i)
            }

            visited[value] = i
        }

        throw NoSuchElementException()
    }
}
