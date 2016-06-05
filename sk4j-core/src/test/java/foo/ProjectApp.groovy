package foo

import sk4j.SkApp
import sk4j.model.EProject

class ProjectApp extends SkApp {

	static main(args) {
		EProject project = new EProject(file: new File("/home/jcruz/Programs/eclipse-mars/workspace/aelis2016"))
		project.javaFiles.each { println "${it.name} - ${it.path}" }
	}
}
