package com.example.carparkingsystem.Service;

import com.example.carparkingsystem.DAO.Cars;
import com.example.carparkingsystem.Repository.carParkingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class carParkingService {
    @Autowired
    private carParkingRepo repo;

    public List<Cars> getAllCars() {
        return repo.findAll();
    }

    public Cars createCars(Cars c) {
        return repo.save(c);
    }

    public Cars updateCar(Cars c, int Car_Id) {
       Cars CarsExist = repo.findById(Car_Id).orElse(null);
        if(CarsExist!=null){
            CarsExist.setUser_name(c.getUser_name());
            CarsExist.setSlot_status(c.getSlot_status());
            return repo.save( CarsExist);
        }
        else{
            return null;
        }
    }

    public String deleteCar(int Car_id) {
        repo.deleteById(Car_id);
        return "Car Deleted Successfully";
    }
}
