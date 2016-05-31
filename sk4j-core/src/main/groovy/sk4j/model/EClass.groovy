package sk4j.model

import org.jboss.forge.roaster.model.source.JavaClassSource

import com.thoughtworks.qdox.model.JavaClass

/**
 * 
 * @author jcruz
 *
 */
class EClass {

	/**
	 * 
	 */
	String name
	/**
	 * 
	 */
	JavaClassSource source

	/**
	 * 
	 */
	JavaClass javaClass

	/**
	 * 
	 */
	List<EAttribute> attributes

	/**
	 * 
	 */
	List<EMethod> methods
}
