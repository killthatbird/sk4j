package sk4j.model

import sk4j.SkTemplate

abstract class EModel<T> implements Comparable<T> {

	SkTemplate template

	/**
	 * 
	 * @param templateClass
	 * @return
	 */
	def merge(Class<? extends SkTemplate> templateClass) {
	}

	/**
	 * 
	 * @param clazz
	 * @return
	 */
	def asType(Class clazz) {
		if(clazz == File) {
		}
	}
	/**
	 * 
	 * @return
	 */
	abstract String getId()
}
