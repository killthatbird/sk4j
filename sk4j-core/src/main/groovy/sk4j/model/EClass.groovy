package sk4j.model

import org.jboss.forge.roaster.model.source.JavaClassSource

import com.thoughtworks.qdox.model.Annotation
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
	 * Verifica se a classe possui a annotation especificada.
	 * @param name
	 * @return
	 */
	boolean hasAnnotation(String name) {
		this.annotations.any { Annotation ann ->
			ann.type.value.endsWith(name)
		}
	}
}
