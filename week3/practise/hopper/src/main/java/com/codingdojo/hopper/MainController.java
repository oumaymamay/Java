 package com.codingdojo.hopper;


 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 public class MainController { // Change to your controller name

     @RequestMapping("/")
     public String index(Model model) {
         String name = "Grace Hopper";
         String itemName = "Copper wire";
         double price = 5.25;
         String description = "Metal strips, also an illustration of nanoseconds.";
         String vendor = "Little Things Corner Store";

         // Add values to the model
         model.addAttribute("name", name);
         model.addAttribute("itemName", itemName);
         model.addAttribute("price", price);
         model.addAttribute("description", description);
         model.addAttribute("vendor", vendor);

         return "index"; // JSP file without .jsp extension
     }
 }
