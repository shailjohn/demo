package com.test.demo.controleer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("test")
	public String test() {
		return "hello!! Welcome !!!!!!";
	}
}
