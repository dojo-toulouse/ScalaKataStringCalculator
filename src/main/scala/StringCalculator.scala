package org.nico.kata.stringcalculatorkata

object StringCalculator {



	def calc (input:String) : Int = {
		def isDelimiter(mayDelimiter: Char) : Boolean = mayDelimiter == ',' || mayDelimiter == '\n'

		def calcIter(inputToConsume: Seq[Char], acc: Int) : Int = inputToConsume match {
			case Nil => acc
			case head::tail if (isDelimiter(head)) => { 
				calcIter(tail, acc)
			}
			case head::tail => { 
				calcIter(tail, head.toInt - 48 + acc)
			}
		}
		calcIter(input.toList, 0)
	}
}

