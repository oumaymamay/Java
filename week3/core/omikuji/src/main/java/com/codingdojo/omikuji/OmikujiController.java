package com.codingdojo.omikuji;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/omikuji")
public class OmikujiController {

    // Display the form for omikuji input
    @GetMapping("")
    public String index(Model model) {
        return "omikuji"; // The form page
    }

    // Handle the form submission
    @PostMapping(value = "/show")
    public String post(HttpSession session, Model model,
                       @RequestParam(value = "number") int number,
                       @RequestParam(value = "nameCity") String nameCity,
                       @RequestParam(value = "namereal") String realname,
                       @RequestParam(value = "hobby") String hobby,
                       @RequestParam(value = "type") String type,
                       @RequestParam(value = "something") String something) {

        // Validate input parameters
        if (number <= 0 || nameCity.isEmpty() || realname.isEmpty() || 
            hobby.isEmpty() || type.isEmpty() || something.isEmpty()) {
            model.addAttribute("errorMessage", "All fields must be filled out correctly!");
            return "omikuji"; // Redirect back to the input page with an error message
        }

        // Store session attributes
        session.setAttribute("number", number);
        session.setAttribute("nameCity", nameCity);
        session.setAttribute("namereal", realname);
        session.setAttribute("hobby", hobby);
        session.setAttribute("type", type);
        session.setAttribute("something", something);
        
        // Redirect to fortune display
        return "redirect:/omikuji/showFortune"; 
    }

    // Display the user's fortune based on session attributes
    @GetMapping("/showFortune")
    public String showFortune(HttpSession session, Model model) {
        // Retrieve session attributes to pass to the view
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("nameCity", session.getAttribute("nameCity"));
        model.addAttribute("namereal", session.getAttribute("namereal"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("type", session.getAttribute("type"));
        model.addAttribute("something", session.getAttribute("something"));
        
        return "showFortune"; // The page to display the fortune
    }
}

