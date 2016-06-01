package sk4j.model

import org.jboss.forge.roaster.model.source.JavaClassSource

import com.thoughtworks.qdox.model.JavaClass

/**
 * 
 * @author jcruz
 *
 */
class EClass extends JavaClass {
	/**
	 * 
	 */
	String path
	/**
	 * 
	 */
	JavaClassSource javaSource

	/**
	 * Verifica se a classe possui a annotation 
	 * @param name
	 * @return
	 */
	boolean hasAnnotation(String name) {
	}
}
