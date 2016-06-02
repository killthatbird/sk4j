package sk4j

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

	def optionCounter = 1

	List<T> options = []

	public ModelChooser(List<T> options) {
		super();
		this.options = options;
	}

	def choose() {
		printOptionList()
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
		options.sort().collectEntries { T m ->
			[(optionCounter++):m.id]
		}
	}


	/**
	 * Le a entrada do usuário
	 * 
	 * @return
	 */
	private readUserInput() {
		System.in.withReader {
			String userInput = it.readLine()
		}
	}
}
