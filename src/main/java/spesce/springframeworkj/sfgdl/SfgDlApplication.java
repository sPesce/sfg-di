package spesce.springframeworkj.sfgdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spesce.springframeworkj.sfgdl.controllers.ConstructorInjectedController;
import spesce.springframeworkj.sfgdl.controllers.MyController;
import spesce.springframeworkj.sfgdl.controllers.PropertyInjectedController;
import spesce.springframeworkj.sfgdl.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDlApplication {

 	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDlApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
