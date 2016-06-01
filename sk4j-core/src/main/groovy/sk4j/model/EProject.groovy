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
	List<EJavaFile> javaFiles

	public EProject() {
		super()
	}


	public List<EJavaFile> getJavaFiles() {
		if(javaFiles == null) {
			this.javaFiles = []
			file.eachFileRecurse(FileType.FILES) {
				if(it.name.endsWith('.java')) {
					JavaDocBuilder builder = new JavaDocBuilder()
					JavaSource source = builder.addSource(it)
					this.javaFiles << new EJavaFile(javaClass: source.classes[0])
				}
			}
		}
		return this.javaFiles
	}
}
