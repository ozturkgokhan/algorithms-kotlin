package com.gokhan.algorithms

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var numberArr = IntArray(2)

        var myMap = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, number ->
            myMap.put(number, index)
        }

        nums.forEachIndexed { index, number ->
            var diff = target - number
            if (myMap.get(diff) != index && myMap.containsKey(diff)) {
                numberArr[0] = myMap?.let {
                    it.get(diff)
                }  ?: 0

                numberArr[1] = index
            }
        }
        return numberArr
    }
}