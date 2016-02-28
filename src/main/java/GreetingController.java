package main.java;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static int counter;

	@RequestMapping(method=RequestMethod.GET, value="/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World!") String name) {
		return new Greeting(++counter, "Hello, " + name);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello, " + name;
	}
}
