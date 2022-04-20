package com.example.cfp2;

/**
 * UC1 :- Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 *        To begin with show Hello from BridgeLabz.
 *        - Use GET Request Method
 *        - Use CURL to demonstrate the REST API Call
 *        - curl localhost:8080/hello -w "\n"
 *
 * UC2 :- Make REST Call to show Hello Mark from BridgeLabz
 *        - Use GET Request Method and pass name as query parameter
 *        - Use CURL to demonstrate the REST API Call
 *        - curl localhost:8080/hello/query?name=Mark -w "\n"
 *
 *
 */

/**
 * import classes
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1) @RestController :-
 *           @RestController is used for making restful web services with the help of the @RestController annotation.
 *           This annotation is used at the class level and allows the class to handle the requests made by the client
 *
 * 2) @RequestMapping :-
 *           @RequestMapping is the most common and widely used annotation in Spring MVC.
 *           It is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods.
 *           name: Assign a name to this mapping.
 *
 * 3) @GetMapping :-
 *           @GetMapping annotation maps HTTP GET requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. GET)
 *
 * 4) @RequestParam :-
 *           @RequestParam is a Spring annotation used to bind a web request parameter to a method parameter.
 *           It has the following optional elements: defaultValue - used as a fallback when the request parameter is not provided or has an empty value.
 *           name - name of the request parameter to bind to
 */
@RestController
@RequestMapping("/web")
/**
 * create a class name as HelloRestController
 */
public class HelloRestController {

    /**
     * UC1 :-
     * create a string type method name as message
     * @return - hello from bridgelabz message
     */
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }

    /**
     * UC2 :-
     * create a method name as sayHello
     * @param name - put name what u want for ex-nilo
     * @return -Hello nilo From BridgeLabz (put name is nilo then o/p this)
     */
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " From BridgeLabz";
    }
}