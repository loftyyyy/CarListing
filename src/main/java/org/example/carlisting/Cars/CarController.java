package org.example.carlisting.Cars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {


    @GetMapping("/")
    public String home(){
        return "index";
    }

    //TODO: Make the header responsive, put a marker to know which page th euser is
}
