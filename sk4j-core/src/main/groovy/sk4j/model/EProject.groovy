package sk4j.model

import groovy.io.FileType

import com.thoughtworks.qdox.JavaDocBuilder
import com.thoughtworks.qdox.model.JavaClass
import com.thoughtworks.qdox.model.JavaSource

/**
 * 
 * @author jcruz
 *
 */
class EProject {

	/**
	 * 
	 */
	String name
	/**
	 * 
	 */
	String path

	/**
	 * 
	 */
	File file

	/**
	 * 
	 */
	List<EModel> models

	public EProject() {
		super()
	}


	public List<EModel> getModels() {
		if(models == null) {
			this.models = []
			file.eachFileRecurse(FileType.FILES) {
				if(it.name.endsWith('.java')) {
					JavaDocBuilder builder = new JavaDocBuilder()
					JavaSource source = builder.addSource(it)
					this.models << new EModel(javaClass: source.classes[0])
				}
			}
		}
		return this.models
	}
}
