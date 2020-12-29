package spesce.springframework;

import org.springframework.context.annotation.ComponentScan;
import spesce.springframework.controllers.ConstructorInjectedController;
import spesce.springframework.controllers.GetterInjectedController;
import spesce.springframework.controllers.MyController;
import spesce.springframework.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spesce.springframework.examplebeans.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"spesce.springframework.services","spesce.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.print(fakeDataSource.getUser());
	}
}
