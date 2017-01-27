package app.poc.di;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class VerySuperClass {

	@Autowired
	private ComponentOne componentOne;

	@Autowired
	private ComponentTwo componentTwo;

	public ComponentOne getComponentOne() {
		return componentOne;
	}

	public void setComponentOne(ComponentOne componentOne) {
		this.componentOne = componentOne;
	}

	public ComponentTwo getComponentTwo() {
		return componentTwo;
	}

	public void setComponentTwo(ComponentTwo componentTwo) {
		this.componentTwo = componentTwo;
	}

	public void ececuteVerySuperClass() {
		System.out.println("Executing VerySuperClass.");
	}
}
