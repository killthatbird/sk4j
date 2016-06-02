package sk4j.model

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaMethod

/**
 * 
 * @author jcruz
 *
 */
class EJavaMethod extends EModel implements Comparable<EJavaMethod>{
	/**
	 * 
	 */
	JavaMethod javaMethod
	/**
	 * Verifica se o método possui a annotation especificada
	 * @param name
	 * @return
	 */
	boolean hasAnnotation(String name) {
		this.annotations.any { Annotation ann ->
			ann.type.value.endsWith(name)
		}
	}
	/**
	 * 
	 */
	@Override
	public int compareTo(EJavaMethod o) {
		return this.javaMethod.name.compareTo(o.javaMethod.name)
	}
	/**
	 * 
	 */
	@Override
	public String getId() {
		return javaMethod.name
	}
}
