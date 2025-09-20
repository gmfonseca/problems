package br.com.gmfonseca.resolutions.leetcode.problem3.solutions

import br.com.gmfonseca.resolutions.leetcode.problem3.LongestSubstringSolution
import kotlin.math.max

class BruteForceSolution : LongestSubstringSolution {
    override fun execute(input: String): Int {
        var longestStr = ""
        var str = ""

        for (i in input.indices) {
            for (j in i until input.length) {
                val char = input[j]

                if (char !in str) {
                    str += char

                    if (str.length > longestStr.length) longestStr = str
                } else {
                    str = ""
                    break
                }
            }
        }

        return max(longestStr.length, str.length)
    }
}
