package com.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallBack() {
		return "User Service is not down at this down";
	}
	
	@GetMapping("/contactServiceFallback")
    public String contactServiceFallback() {
        return "Contact service is down at this time";
    }

}
