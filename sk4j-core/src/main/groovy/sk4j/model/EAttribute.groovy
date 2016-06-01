package sk4j.model

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaField

/**
 * 
 * @author jcruz
 *
 */
class EAttribute extends JavaField {
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
}
