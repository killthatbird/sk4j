package sk4j

import sk4j.model.EProject;

class SkApp {
	static EProject project

	def task(Class<SkTask> skTaskClass) {
		skTaskClass.newInstance().doTask()
	}
}
