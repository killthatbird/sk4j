package sk4j.model

import groovy.text.GStringTemplateEngine
import groovy.text.Template
import sk4j.SkTemplate

abstract class EModel<T>  {

	SkTemplate template

	String mergedTemplate

	/**
	 * 
	 * @param templateClass
	 * @return
	 */
	def merge(Class<? extends SkTemplate> templateClass) {
		this.template = templateClass.newInstance()
		template.context['model'] = this
		template.init()
		Writable t = new GStringTemplateEngine().createTemplate(template.template()).make(context: template.context)
		mergedTemplate = t.toString()
		return this
	}

	/**
	 * 
	 * @param clazz
	 * @return
	 */
	def asType(Class clazz) {
		if(clazz == File) {
			File file = new File(template.context['outputPath'])
		} else if(clazz == String) {
			mergedTemplate
		}
	}
}
