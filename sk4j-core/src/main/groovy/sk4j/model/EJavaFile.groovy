package sk4j.model

import org.jboss.forge.roaster.model.source.JavaClassSource

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaClass

/**
 * 
 * @author jcruz
 *
 */
class EJavaFile implements Comparable<EJavaFile>  {

	JavaClass javaClass

	/**
	 * 
	 */
	JavaClassSource javaClassSource
	/**
	 * 
	 */
	String path

	/**
	 * 
	 */
	List<EJavaAttribute> javaAttributes

	/**
	 * 
	 */
	List<EJavaMethod> javaMethods

	/**
	 * Verifica se a classe possui a annotation especificada.
	 * @param name
	 * @return
	 */
	boolean hasAnnotation(String name) {
		javaClass.annotations.any { Annotation ann ->
			ann.type.value.endsWith(name)
		}
	}
	@Override
	public int compareTo(EJavaFile o) {
		return this.javaClass.name.compareTo(o.javaClass.name)
	}
}
