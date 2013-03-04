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
  "String Calculator" should {
    "empty string returns zero" in {
      StringCalculator.doSum("") must beEqualTo (0)
    }
    "A single number returns the value" in {
      StringCalculator.doSum("12") must beEqualTo (12)
    }

    "two numbers, comma delimited, return the sum" in {
      StringCalculator.doSum("12,12") must beEqualTo (24)
    }

    "Three numbers, comma delimited, return the sum" in {
      StringCalculator.doSum("12,12,13") must beEqualTo (37)
    }

    "Two numbers, new line delimited, return the sum" in {
      StringCalculator.doSum("1\n2") must beEqualTo (3) 
    }

    "Negative numbers should be handled" in {
      StringCalculator.doSum("-1\n2") must beEqualTo (1)       
    }

    "Spaces should not be a problem" in {
      StringCalculator.doSum("42, 8") must beEqualTo (50)       
    }
    "Big numbers should be ignored" in {
      StringCalculator.doSum("1000, 1") must beEqualTo (1)       
    }
    "First line starting with // should be ignored" in {
      StringCalculator.doSum("//t\n2") must beEqualTo (2)
    }
    "First line starting with // should define the delimiter" in {
      StringCalculator.doSum("//#\n2#3") must beEqualTo (5)
    }

  }
}
