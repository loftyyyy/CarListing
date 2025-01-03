package org.example.carlisting.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;


    @Autowired
    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }



    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public void addCar(Car car){
        carRepository.save(car);
    }



}
