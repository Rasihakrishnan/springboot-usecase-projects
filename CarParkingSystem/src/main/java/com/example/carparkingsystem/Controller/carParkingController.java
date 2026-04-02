package com.example.carparkingsystem.Controller;

import com.example.carparkingsystem.DAO.Cars;
import com.example.carparkingsystem.Service.carParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cars")

public class carParkingController {
    @Autowired
    private carParkingService service;
    @GetMapping
    public List<Cars> getCars(){
        return service.getAllCars();
    }
    @PostMapping
    public Cars create(@RequestBody Cars c){
        return service.createCars(c);
    }
    @PutMapping("/{Car_id}")
    public Cars update(@RequestBody Cars c,@PathVariable int Car_id){
        return service.updateCar(c,Car_id);
    }
    @DeleteMapping("/{Car_id}")
    public String delete(@PathVariable int Car_id){
        return service.deleteCar(Car_id);
    }
}
