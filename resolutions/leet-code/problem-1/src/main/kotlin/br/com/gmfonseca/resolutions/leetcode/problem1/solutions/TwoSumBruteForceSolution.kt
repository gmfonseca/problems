package br.com.gmfonseca.resolutions.leetcode.problem1.solutions

import br.com.gmfonseca.resolutions.leetcode.problem1.TwoSumSolution
import java.util.NoSuchElementException

class TwoSumBruteForceSolution : TwoSumSolution {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (j == i) continue

                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        throw NoSuchElementException()
    }
}
