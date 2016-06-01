package sk4j

import sk4j.model.EModel
import sk4j.model.EProject

class EProjectTest {

	static main(args) {
		EProject project = EProjectFactory.instance.create('/home/jcruz/Programs/eclipse-mars/workspace/aelis2016')
		project.models.each { EModel model ->
			println model.javaClass.name
		}
	}
}
