import es.chebetos.adventofcode2021.Day01
import java.io.File

fun main() {
    println("Day 01 part 1: ${Day01.part1(readInput("day01.part1"))}")
}

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) =
    File(ClassLoader.getSystemResource("$name.txt").file)
        .readLines()
