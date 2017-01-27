package app.poc.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class RunApp {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RunApp.class, args);

		ChildClass cc = ctx.getBean(ChildClass.class);
		cc.getComponentOne().executeComponentOne();
		cc.getComponentTwo().executeComponentTwo();
		cc.ececuteVerySuperClass();
		cc.executeSuperClass();
		cc.executeChildClass();
	}
}
