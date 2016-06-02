package foo

import sk4j.ModelChooser

class ModelChooserTest {
	
	static main(args) {
		
		/* Lista de Models */
		def options = [
			new ModelFoo(name:"Atividade"),
			new ModelFoo(name:"PontoGeografico"),
			new ModelFoo(name:"Material")
		]

		new ModelChooser<ModelFoo>(options).chooseSingle()
	}
}
