package foo.task

import sk4j.SkTask

class DaoTask extends SkTask {

	@Override
	public void doTask() {
		println context.model
	}
}
