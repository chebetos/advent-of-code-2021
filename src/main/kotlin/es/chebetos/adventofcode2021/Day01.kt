package es.chebetos.adventofcode2021

class Day01 {
    companion object {
        fun part1(input: List<String>): Int {
            var previousMeasure = 0
            var numberOfTimesADepthMeasurementIncrease = -1
            input.forEach {
                val measurement = it.toInt()
                if (measurement > previousMeasure) {
                    numberOfTimesADepthMeasurementIncrease++
                }
                previousMeasure = measurement
            }
            return numberOfTimesADepthMeasurementIncrease
        }
    }
}
