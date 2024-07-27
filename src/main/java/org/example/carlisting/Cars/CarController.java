package org.example.carlisting.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;
    private final AzureBlobService azureBlobService;

    @Autowired
    public CarController(CarService carService, AzureBlobService azureBlobService
    ){
        this.carService = carService;
        this.azureBlobService = azureBlobService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("currentPage", "index");

        return "index";
    }

    @GetMapping("/browse")
    public String browse(Model model){
        model.addAttribute("currentPage", "browse");
        List<Car> CarList = carService.getAllCars();
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
            @RequestParam String description, @RequestParam MultipartFile img
    ) throws IOException {

        //TODO: Add an intervention here wherein img is uploaded to the azure and get the url and put that url in the car database
        String imageUrl = azureBlobService.uploadImage(img);
        Car newCar = new Car(year, price, registration, brand, model, description, color, imageUrl );
        carService.addCar(newCar);

        return "redirect:/sell";
    }


    //TODO: Make the header responsive, put a marker to know which page th euser is
}
