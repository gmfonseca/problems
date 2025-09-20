package br.com.gmfonseca.resolutions.leetcode.problem1.solutions

import br.com.gmfonseca.resolutions.leetcode.problem1.TwoSumSolution
import java.util.NoSuchElementException

class TwoSumCheaperSolution : TwoSumSolution {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.mapIndexed { i, it -> if (it == 0) i else null  }.filterNotNull().toSet()

        for (i in nums.indices) {
            val missing = target - nums[i]

            for (j in (i + 1) until nums.size) {
                if (nums[j] == missing) {
                    return intArrayOf(i, j)
                }
            }
        }

        throw NoSuchElementException()
    }
}
