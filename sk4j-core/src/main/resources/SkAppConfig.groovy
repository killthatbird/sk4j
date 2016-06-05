name = "DaoGenetator"

templates {
	dao {
		templatePath = 'dao/dao.jtwig'
		outputPath = '${javaFile.path}/../persistence/${javaFile.id}DAO.java'
	}
}
