package sk4j.model

import com.thoughtworks.qdox.model.Annotation
import com.thoughtworks.qdox.model.JavaMethod

/**
 * 
 * @author jcruz
 *
 */
class EMethod extends JavaMethod{

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
}
