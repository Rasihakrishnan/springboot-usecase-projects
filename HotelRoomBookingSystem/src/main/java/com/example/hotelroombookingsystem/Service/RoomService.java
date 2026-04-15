package com.example.hotelroombookingsystem.Service;

import com.example.hotelroombookingsystem.Dao.Rooms;
import com.example.hotelroombookingsystem.Repository.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RoomService {

    @Autowired
    private RoomRepo repo;

    public List<Rooms> getAllRooms() {
        return repo.findAll();
    }

    public Rooms createRoom(Rooms r) {
        return repo.save(r);
    }

    public String deleteRoom(int room_id) {
        repo.deleteById(room_id);
        return "Room deleted successfully";
    }

    public Rooms updateRoom(Rooms r, int room_id) {

        Rooms existing = repo.findById(room_id).orElse(null);

        if (existing != null) {

            existing.setRoom_type(r.getRoom_type());
            existing.setCustomer_name(r.getCustomer_name());
            existing.setRoom_status(r.getRoom_status());

            return repo.save(existing);

        } else {
            return null;
        }
    }
}
