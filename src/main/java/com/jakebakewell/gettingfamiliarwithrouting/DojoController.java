package com.jakebakewell.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	@RequestMapping("/{place}")
	public String dojoHello(@PathVariable("place") String place) {
		if (place.equals("dojo")) {
			return "The dojo is awesome!";
		}
		else if (place.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California.";
		}
		else if (place.equals("san-jose")) {
			return "SJ dojo is the headquarters.";
		}
		else {
			return "please type in dojo, burbank-dojo, or san-jose into the url";
		}
	}
}
