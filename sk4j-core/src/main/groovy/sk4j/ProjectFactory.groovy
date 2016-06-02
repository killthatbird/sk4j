package sk4j

import sk4j.model.EProject


@Singleton
class ProjectFactory {

	EProject create(String path) {
		new EProject(file: new File(path))
	}
}
