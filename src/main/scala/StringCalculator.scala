package org.nico.kata.stringcalculatorkata

object StringCalculator {

	def doSum(values: String): Int = {
		var delimiter = 
        if (values.startsWith("//")) {
        	values.charAt(2)	
        }	
        else {
        	""
        }
 		val stringTokens = values.split(s"[,\n$delimiter]").filter(x => !x.startsWith("//"))
		tabSum(stringTokens)
	}

	def tabSum(tab: Seq[String]): Int =  {
		val tabOfNumbers: Seq[Int] = tab.map(x => x match {
				case ""=> 0
				case x => x.trim.toInt
			})
		tabOfNumbers.filter( _ < 1000).sum
	} 
  
}
