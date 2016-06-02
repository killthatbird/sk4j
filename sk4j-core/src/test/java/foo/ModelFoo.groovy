package foo

import sk4j.model.EJavaFile;
import sk4j.model.EModel

class ModelFoo extends EModel<ModelFoo> {
	String name

	@Override
	public String getId() {
		return name;
	}
	@Override
	public int compareTo(ModelFoo o) {
		return name.compareTo(o.name);
	}
}
