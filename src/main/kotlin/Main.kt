package org.example

import kotlin.math.sqrt


fun main() {
    //printDivisorsUsingBruteForce(60)
    //printDivisorsUsingBruteForceUpToHalf(60)
    //printDivisorsUsingSqrtOptimization(60)
}

/**
 * Prints all divisors of a given number using a brute-force approach.
 *
 */
fun printDivisorsUsingBruteForce(n: Int) {
    var i = 1
    while (i < n) {
        if (n % i == 0) println("It's a divisor $i") else println("It's not a divisor $i")
        i++
    }
}


/**
 * Prints all divisors of a given number using a brute-force approach.
 *
 * This method checks divisibility from 1 up to n/2 (inclusive),
 * since no number greater than n/2 (except n itself) can divide n.
 */
fun printDivisorsUsingBruteForceUpToHalf(n: Int) {
    var i = 1
    while (i < n / 2) {
        if (n % i == 0) println("It's a divisor $i") else println("It's not a divisor $i")
        i++
    }
}

/**
 * Prints all divisors of a given number using square methode.
 *
 * This method checks divisibility from i up to square of i (inclusive),
 * since n is divisible by i and also by n/i
 */
fun printDivisorsUsingSqrtOptimization(n: Int) {
    val divisors = mutableSetOf<Int>()
    var i = 1
    while (i * i <= n) {
        if (n % i == 0) {
            divisors.add(i)
            divisors.add(n / i)
        }
        i++
    }

    println("Divisors of $n are: ${divisors.sorted()}")
}
