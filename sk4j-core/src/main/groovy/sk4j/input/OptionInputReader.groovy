package sk4j.input

class OptionInputReader extends InputReader {

	/**
	 * 
	 */
	List<Choosable<?>> options

	/**
	 * Uma opção válida é um número e entra o range de opções de 1 a options.size
	 */
	def validOption = {
		it ==~ /\s*\d\d*/ && (it as Integer) in(1..options.size)
	}

	def printOptions() {
		def sortedOptions = options.sort().eachWithIndex { item , i -> println "[${i+1}] ${options[i]} " }
	}
}
