package sk4j.model

import sk4j.input.Choosable

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaField

/**
 * 
 * @author jcruz
 *
 */
class EJavaAttribute extends EModel<EJavaAttribute> implements Choosable<EJavaAttribute>   {
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
		this.annotations.any { Annotation ann -> ann.type.value.endsWith(name) }
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
	public String getChoiseLabel() {
		return javaField.name
	}
}
