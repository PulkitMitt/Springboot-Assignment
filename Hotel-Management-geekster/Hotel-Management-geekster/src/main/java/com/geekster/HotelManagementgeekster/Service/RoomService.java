package com.geekster.HotelManagementgeekster.Service;

import com.geekster.HotelManagementgeekster.Model.HotelRoom;
import com.geekster.HotelManagementgeekster.Repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    IRoomRepo iRoomRepo;
    public Iterable<HotelRoom> getAllRooms() {
        return iRoomRepo.findAll();
    }

    public String addRoom(HotelRoom hotelRoom) {
        iRoomRepo.save(hotelRoom);
        return "Room has been added";
    }
}
