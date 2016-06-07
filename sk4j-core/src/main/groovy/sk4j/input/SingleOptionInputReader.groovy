package sk4j.input

class SingleOptionInputReader extends OptionInputReader {

	@Override
	def read() {
		inputLabel = "\nDigite o número da opção: "
		printOptions()
		super.read()
		boolean valid = validOption(inputValue)
		if(!valid) {
			exit()
		}
	}
}
