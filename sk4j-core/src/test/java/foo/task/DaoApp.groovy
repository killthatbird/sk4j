package foo.task

import sk4j.SkApp

class DaoApp extends SkApp {
	static main(args) {
		SkApp.task(DaoTask.class, [model:'jose'])
	}
}
