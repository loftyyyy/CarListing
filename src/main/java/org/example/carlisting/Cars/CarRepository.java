package org.example.carlisting.Cars;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> getAllByBrand(String brand);
    List<Car> getAllByColor(String color);



}
