package com.example.hotelroombookingsystem.Repository;

import com.example.hotelroombookingsystem.Dao.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Rooms, Integer> {

}