package br.com.gmfonseca.resolutions.leetcode.problem1

data class TwoSumInput(val nums: IntArray, val target: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TwoSumInput

        if (!nums.contentEquals(other.nums)) return false
        if (target != other.target) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nums.contentHashCode()
        result = 31 * result + target
        return result
    }
}
