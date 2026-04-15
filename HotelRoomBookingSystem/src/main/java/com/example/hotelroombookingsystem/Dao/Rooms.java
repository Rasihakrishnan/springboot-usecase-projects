package com.example.hotelroombookingsystem.Dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long room_id;
    private String room_type;
    private String customer_name;
    private String room_status;
}
