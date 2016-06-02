package sk4j.model

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaField

/**
 * 
 * @author jcruz
 *
 */
class EJavaAttribute extends EModel implements Comparable<EJavaAttribute>   {
	/**
	 * 
	 */
	JavaField javaField
	/**
	 * 
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
	public int compareTo(EJavaAttribute o) {
		return this.javaField.name.compareTo(o.javaField.name)
	}
	/**
	 * 
	 */
	@Override
	public String getId() {
		return javaField.name
	}
}
