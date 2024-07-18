package org.example.carlisting.Cars;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {


    @GetMapping("/")
    public String home(Model model){

        return "index";
    }

    @GetMapping("/browse")
    public String browse(Model model){
        return "browse";
    }

    @GetMapping("/sell")
    public String sell(Model model){
        return "sell";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        return "contact";
    }

    //TODO: Make the header responsive, put a marker to know which page th euser is
}
