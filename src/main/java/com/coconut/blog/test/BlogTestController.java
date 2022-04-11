/**
 * 
 */
package com.coconut.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author neoluc
 *
 */
@RestController
public class BlogTestController {

	@GetMapping("test/hello")
	public String hello() {
		return "<h1>Hello, <br> BlogTestController []</h1>";
	}
		
}
