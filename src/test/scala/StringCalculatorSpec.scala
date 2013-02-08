package org.nico.kata.stringcalculatorkata

import org.specs2.mutable._

class StringCalculatorSpec extends Specification {

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }
  "Calc" should {
    "return 0 when empty string" in {
      StringCalculator.calc("") must beEqualTo(0)
    }

    "return 2 when string '2' passed" in {
      StringCalculator.calc("2") must beEqualTo(2)
    }

    "return 3 when string '3' passed" in {
      StringCalculator.calc("3") must beEqualTo(3)
    }

    "return 5 when string '2,3' passed" in {
      StringCalculator.calc("2,3") must beEqualTo(5)
    }

    "return 4 when string '1,3' passed" in {
      StringCalculator.calc("1,3") must beEqualTo(4)
    }

    "two numbers, newline delimited, returns the sum" in {
      StringCalculator.calc("1\n3") must beEqualTo(4)
    }
  
  } 




}
