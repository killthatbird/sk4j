package sk4j

import sk4j.model.EJavaFile
import sk4j.model.EProject

class EProjectTest {

	static main(args) {
		EProject project = ProjectFactory.instance.create('/home/jcruz/Programs/eclipse-mars/workspace/aelis2016')

		def entities = project.javaFiles.findAll { it.hasAnnotation('Entity') }
		entities.sort().each { EJavaFile javaFile ->
			println javaFile.javaClass.name
		}
	}
}
