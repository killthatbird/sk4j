package sk4j

import groovy.util.logging.Log

/**
 * 
 * @author jcruz
 *
 */
abstract class SkTask {

	def context = [:]

	/**
	 * 
	 * @return
	 */
	abstract void doTask()
}
