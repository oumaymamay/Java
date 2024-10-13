package com.codingdojo.hellohumain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    @RequestMapping("/")
    public String hello(
            @RequestParam(value = "q", required = false) String searchQuery,
            @RequestParam(value = "lastName", required = false) String lastName,
            @RequestParam(value = "times", required = false, defaultValue = "1") int times) {
        
        System.out.println("The search query is: " + searchQuery);
        
        // Default greeting if no name is provided
        if (searchQuery == null || searchQuery.isEmpty()) {
            return "Hello Human";
        }
        
        // Prepare the greeting message
        StringBuilder result = new StringBuilder();
        String greeting = "Hello: " + searchQuery;
        
        // Append last name if provided
        if (lastName != null && !lastName.isEmpty()) {
            greeting += " " + lastName;
        }
        
        // Repeat the greeting based on the "times" parameter
        for (int i = 0; i < times; i++) {
            result.append(greeting);
            if (i < times - 1) { // Add a newline for readability, if multiple greetings
                result.append("\n");
            }
        }
        
        return result.toString();
    }
}
