package spesce.springframeworkj.sfgdl.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created By Steve P. on 11/18/2020
 * original package: spesce.springframeworkj.sfgdl.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!");

        return "Hello There!";
    }
}
