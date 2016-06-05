package sk4j

import sk4j.model.EProject

/**
 * 
 * @author jcruz
 *
 */
class SkContext {

	/**
	 * 
	 */
	EProject project = System.getProperty("user.dir")

	/**
	 * 
	 */
	def context = [:]

	/**
	 * 
	 * @param taskParamMap
	 * @return
	 */
	static def task(Class<? extends SkTask> taskClass) {
		SkTask task = taskClass.newInstance()
		task.doTask()
	}

	/**
	 * 
	 * @param taskClass
	 * @param taskContext
	 * @return
	 */
	static def task(Class<? extends SkTask> taskClass, taskContext) {
		SkTask task = taskClass.newInstance()
		task.context = taskContext
		task.doTask()
	}
}
