package sk4j

import sk4j.model.EModel

class ModelChooser {

	def userSelectedOptionList

	def optionCounter = 1

	List<EModel> optionList = []

	def choose() {
		optionList.collectEntries { EModel m ->
			[(optionCounter++):m.id]
		}
	}

	private def read() {
		System.in.withReader {
			String userInput = it.readLine()
		}
	}
}
