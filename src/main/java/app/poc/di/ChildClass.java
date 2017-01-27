package app.poc.di;

import org.springframework.stereotype.Component;

@Component
public class ChildClass extends SuperClass {

	public void executeChildClass() {
		System.out.println("Executing ChildClass");
	}

}
