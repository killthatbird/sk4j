package foo

import sk4j.SkTemplate

class DaoTemplate extends SkTemplate {

	@Override
	void init() {
		//context['outputPath'] = "${javaFile.path}/../persistence/${}"
	}

	@Override
	def template() {
		'''
		public class ${javaFile.javaClass.name}DAO {
		}
	'''
	}
}
