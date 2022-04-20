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
 * UC3 :- Make REST Call to show Hello Mark from BridgeLabz
 *        - Use GET Request Method and pass name as path variable
 *        - Use CURL to demonstrate the REST API Call
 *        - curl localhost:8080/hello/param/Mark -w"\n"
 *
 * UC4 :- Make REST Call to show Hello Mark Taylor from BridgeLabz
 *        - Use POST Request Method and pass first name and last name in the Body
 *        - Create User DTO Bean with firstName and lastName as attributes.
 *        - Use CURL to demonstrate the REST API Call
 *        - curl -X POST -H "Content-Type: application/json" -d
 *         '{"firstName": ”Mark","lastName": ”Taylor"}'
 *          "http://localhost:8080/hello/post" -w "\n"
 *
 * UC5 :- Make REST Call to show Hello Mark Taylor from BridgeLabz
 *        - Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter
 *        - Use CURL to demonstrate the REST API Call
 *        - curl -X PUT localhost:8080/hello/put/Mark/?lastName=Taylor -w "\n"
 *
 */

/**
 * import classes
 */
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;



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
 *
 * 5) @PostMapping :-
 *           @PostMapping annotation maps HTTP POST requests onto specific handler methods.
 *           It is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST)
 *
 * 6) @PathVariable :-
 *           @PathVariable is a Spring annotation which indicates that a method parameter should be bound to a URI template variable. It has the following optional elements: name - name of the path variable to bind to.
 *           required - tells whether the path variable is required.
 *
 *
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

    /**
     * UC3:-
     * create a method name as sayHelloParam
     * @param name - put the name what u want
     * @return - message
     */
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " From BridgeLabz";
    }


    /**
     * UC4:-
     * create a method name as userData
     * @param user - firstname,lastname
     * @return - message
     */
    @PostMapping("/post")
    public String userData(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    /**
     * UC5 :-
     * create a method name as sayHello
     * @param fName- user first name
     * @param lName- user last name
     * @return- message
     */
    @PutMapping("/put/{fName}")
    public String sayHello(@PathVariable String fName, @RequestParam String lName) {
        return "Hello " + fName + " " + lName + " from BridgeLabz..!";
    }

}