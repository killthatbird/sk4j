package sk4j

import groovy.util.logging.Log;
import sk4j.model.EProject

class SkApp {
	static EProject project

	/**
	 * 
	 * @param taskParamMap
	 * @return
	 */
	static def task(Class<? extends SkTask> taskClass) {
		SkTask task = taskClass.newInstance()
		task.doTask()
	}

	static def task(Class<? extends SkTask> taskClass, taskContext) {
		SkTask task = taskClass.newInstance()
		task.context = taskContext
		task.doTask()
	}
}
