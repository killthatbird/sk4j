package sk4j

/**
 * 
 * @author jcruz
 *
 */
abstract class SkGeneratorTask extends SkTask {

	/**
	 * 
	 */
	abstract void generate()

	/**
	 * 
	 */
	@Override
	public void doTask() {
		generate()
	}
}
