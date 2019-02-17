package com.gokhan.unittests

import com.gokhan.algorithms.FizzBuzz
import com.gokhan.algorithms.RobotReturnToOrigin
import com.gokhan.algorithms.TwoSum
import org.junit.Test
import kotlin.test.assertEquals

class UnitTests {
    @Test
    fun fizzBuzzHappyPath() {
        val result = listOf("1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz",
            "16",
            "17",
            "Fizz")

        val testIt = FizzBuzz()
        assertEquals(result , testIt.fizzBuzz(18))
    }

    @Test
    fun twoSumHappyPath() {
        val testIt = TwoSum()
        val pass = listOf(1,3,5,7,9).toIntArray()
        assertEquals(listOf(1,4), testIt.twoSum(pass, 12).toList())
    }

    @Test
    fun robotReturnTooriginHappyPath() {
        val testIt = RobotReturnToOrigin()

        assertEquals(true, testIt.judgeCircle("UDLLRRDDUU"))
    }

}