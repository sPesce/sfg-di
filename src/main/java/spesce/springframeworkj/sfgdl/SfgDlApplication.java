package spesce.springframeworkj.sfgdl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spesce.springframeworkj.sfgdl.controllers.MyController;

@SpringBootApplication
public class SfgDlApplication {

 	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDlApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
