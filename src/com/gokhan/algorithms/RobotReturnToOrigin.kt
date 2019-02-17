package com.gokhan.algorithms

class RobotReturnToOrigin {
    fun judgeCircle(moves: String): Boolean {
        val sequence = moves.split("")
        var xCoordinate = 0
        var yCoordinate = 0

        sequence.forEach {
            when(it) {
                "U" -> yCoordinate ++
                "D" -> yCoordinate --
                "R" -> xCoordinate ++
                "L" -> xCoordinate --
            }
        }
        return xCoordinate == 0 && yCoordinate == 0
    }
}