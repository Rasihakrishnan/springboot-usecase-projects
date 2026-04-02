package com.example.carparkingsystem.Repository;

import com.example.carparkingsystem.DAO.Cars;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface carParkingRepo extends JpaRepository<Cars,Integer>{
    List<Cars> findAll();

    Cars save(Cars c);

    void deleteById(int carId);

   // ScopedValue<Object> findById(int carId);
}
