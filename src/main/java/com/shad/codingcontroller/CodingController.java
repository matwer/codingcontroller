/**
 * 
 */
package com.shad.codingcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matthew Werner
 * i wonder if this will work...
 * success!!!
 */

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python") 
	public String python() {
		return "Pythong/Django was...interesting...";
	}
	
	@RequestMapping("/java") 
	public String java() {
		return "Java/Spring is also...interesting... :)";
	}
}
