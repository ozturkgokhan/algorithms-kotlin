package com.gokhan.algorithms

class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()

        for (number in 1..n) {
            if (number % 3 == 0 && number % 5 == 0) {
                list.add("FizzBuzz")
            } else if (number % 5 == 0) {
                list.add("Buzz")
            } else if (number % 3 == 0) {
                list.add("Fizz")
            } else {
                list.add(number.toString())
            }
        }
        return list
    }
}