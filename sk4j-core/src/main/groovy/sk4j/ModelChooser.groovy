package sk4j

import java.net.InetAddress.Cache;
import java.util.List;

import sk4j.model.EModel

/**
 * Classe que monta a seleção de modelos via linha de comando.
 * 
 * @author jcruz
 *
 * @param <T>
 */
class ModelChooser<T extends EModel> {

	def userSelectedOptionList = []

	def optionCounter = 0

	def optionMap = [:]

	List<T> options = []

	def validInputPattern = ['single': /\s*\d\d*/, 'multiple': /\s*\d(\d*|\s*,\s*\d+)?/ ]

	public ModelChooser(List<T> options) {
		super();
		this.options = options;
	}

	def chooseSingle() {
		printOptionList()
		readUserInputSingle()
	}

	def chooseMultiple() {
		printOptionList()
		readUserInputMultiple()
	}

	/**
	 * Exibe na console as opções para seleção.
	 * 
	 * @return
	 */
	private printOptionList() {
		trasformOptionListToMap().each { key, value ->
			println "[$key] $value"
		}
	}

	/**
	 * 
	 * @return
	 */
	private trasformOptionListToMap() {
		optionMap = options.sort().collectEntries { T m ->
			[(++optionCounter):m.id]
		}
	}

	/**
	 * Le a entrada do usuário com suporte para seleção simples apenas.
	 *
	 * @return
	 */
	private readUserInputSingle() {
		def userInput
		System.in.withReader {
			print "\nDigite o número da opção: "
			userInput = it.readLine()
		}
		validateInputSingle(userInput)
		optionMap[Integer.valueOf(userInput)]
	}

	private validateInputSingle(input) {
		def valid = input ==~ validInputPattern['single'] && Integer.valueOf(input) in(1..optionCounter)
		if(!valid) {
			println "Opção inválida: ${input}"
			System.exit(1)
		}
	}

	/**
	 * Le a entrada do usuário com suporte para seleção multipla.
	 * 
	 * @return
	 */
	private readUserInputMultiple() {
		def userInput
		System.in.withReader {
			print "\nDigite o(s) número(s) da(s) opção(s) ([${++optionCounter}] Selecionar tudo): "
			userInput = it.readLine()
		}
		validateInputMultiple(userInput)
	}

	private validateInputMultiple(input) {
		def valid = input ==~ validInputPattern['multiple']
		if(!valid) {
			println "Opção inválida: ${input}"
			System.exit(1)
		}
		def cacheOptionList = input.split(',').collect { Integer.valueOf(it) }

		println cacheOptionList
	}
}
