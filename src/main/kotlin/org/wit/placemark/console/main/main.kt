package org.wit.placemark.console.main

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {
  logger.info { "Launching Placemark Console App" }
  println("Placemark Kotlin App Version 1.0")

  var input: Int

  do {
    input = menu()
    when(input) {
      1 -> println("You Chose Add Placemark")
      2 -> println("You Chose Update Placemark")
      3 -> println("You Chose List All Placemarks")
      -1 -> println("Exiting App")
      else -> println("Invalid Option")
    }
    println()
  } while (input != -1)
  logger.info { "Shutting Down Placemark Console App" }
}

fun menu() : Int {

  var option : Int
  var input: String? = null

  println("Main Menu")
  println(" 1. Add Placemark")
  println(" 2. Update Placemark")
  println(" 3. List All Placemarks")
  println("-1. Exit")
  println()
  print("Enter an integer : ")
  input = readLine()!!
  option = if (input.toIntOrNull() != null && !input.isEmpty())
    input.toInt()
  else
    -9
  return option
}

