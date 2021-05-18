package io.javabrains.springbootstarter.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages={"io.javabrains.springbootstarter.hello"})
public class HelloController {

	
@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
	
}
