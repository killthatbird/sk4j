package sk4j

import sk4j.model.EModel

/**
 * Classe que monta a seleção de modelos via linha de comando.
 * 
 * @author jcruz
 *
 * @param <T>
 */
class ModelChooser<T extends EModel> {

	def userSelectedOptionList

	def optionCounter = 1

	List<T> options = []

	def choose() {
		options.collectEntries { T m ->
			[(optionCounter++):m.id]
		}
	}

	private def read() {
		System.in.withReader {
			String userInput = it.readLine()
		}
	}
}
