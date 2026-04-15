package com.example.hotelroombookingsystem.Controller;

import com.example.hotelroombookingsystem.Dao.Rooms;
import com.example.hotelroombookingsystem.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")

public class RoomController {

    @Autowired
    private RoomService serviceobj;

    @GetMapping
    public List<Rooms> getAllRooms() {

        return serviceobj.getAllRooms();
    }

    @PostMapping
    public Rooms create(@RequestBody Rooms r) {

        return serviceobj.createRoom(r);
    }

    @PutMapping("/{room_id}")
    public Rooms update(@RequestBody Rooms r,@PathVariable int room_id) {

        return serviceobj.updateRoom(r,room_id);
    }

    @DeleteMapping("/{room_id}")
    public String delete(@PathVariable int room_id) {

        return serviceobj.deleteRoom(room_id);
    }
}