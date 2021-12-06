package es.chebetos.adventofcode2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01Test {
    @Test
    fun part1Test() {
        val input = listOf(
            "199",
            "200",
            "208",
            "210",
            "200",
            "207",
            "240",
            "269",
            "260",
            "263"
        )
        val output = Day01.part1(input)
        assertEquals(7, output)
    }
}
