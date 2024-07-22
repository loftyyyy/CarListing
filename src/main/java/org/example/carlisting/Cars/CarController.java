package org.example.carlisting.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }
    private ArrayList<Car> CarList = new ArrayList<>();
    //TODO: Implement Service DI to replace CarList array for a database.

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("currentPage", "index");

        return "index";
    }

    @GetMapping("/browse")
    public String browse(Model model){
        model.addAttribute("currentPage", "browse");
        model.addAttribute("cars", CarList);

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


    @PostMapping("/addCar")
    public String addCar(
            @RequestParam int year, @RequestParam String registration,
            @RequestParam String price, @RequestParam String brand,
            @RequestParam String model, @RequestParam String color,
            @RequestParam String description
    ){

        Car newCar = new Car(year, price, registration, brand, model, description, color );
        CarList.add(newCar);

        return "redirect:/sell";
    }


    //TODO: Make the header responsive, put a marker to know which page th euser is
}
