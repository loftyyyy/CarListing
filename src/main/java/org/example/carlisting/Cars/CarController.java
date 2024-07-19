package org.example.carlisting.Cars;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("currentPage", "index");

        return "index";
    }

    @GetMapping("/browse")
    public String browse(Model model){
        model.addAttribute("currentPage", "browse");

        return "browse";
    }

    @GetMapping("/sell")
    public String sell(Model model){
        model.addAttribute("currentPage", "sell");
        return "sell";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("currentPage", "about");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("currentPage", "contact");
        return "contact";
    }

    //TODO: Make the header responsive, put a marker to know which page th euser is
}
