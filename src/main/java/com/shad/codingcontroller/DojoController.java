/**
 * 
 */
package com.shad.codingcontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Matthew Werner
 * i wonder if this will work...
 */

@RestController
public class DojoController {
	@RequestMapping("/{input}")
	public String dojo(@PathVariable("input") String input) {
		if (input.equals("dojo")) {
			return "the dojo is awesome!";
		} else if (input.equals("burbank-dojo")){
			return "burbank dojo is located in sunny SoCal!";
		} else if (input.equals("san-jose")){
			return "the dojo's heaquaerters are in San Jose!";
		} else {
			return "invalid URL";
		}
	}
}
