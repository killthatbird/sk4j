package foo

import sk4j.SkTemplate

class DaoTemplate extends SkTemplate {

	@Override
	void init() {
		context['outputPath'] = "${context.model.path}/../persistence/${context.model.name}DAO1.java"
	}

	@Override
	def template() {
		'''
		public class ${context.model.name}DAO {
		}
	'''
	}
}
