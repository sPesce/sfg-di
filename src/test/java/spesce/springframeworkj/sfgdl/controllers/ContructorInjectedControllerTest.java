package spesce.springframeworkj.sfgdl.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spesce.springframeworkj.sfgdl.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ContructorInjectedControllerTest {

    ContructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}