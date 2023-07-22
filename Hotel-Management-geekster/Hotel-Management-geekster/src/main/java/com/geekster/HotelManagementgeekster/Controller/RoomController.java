package com.geekster.HotelManagementgeekster.Controller;

import com.geekster.HotelManagementgeekster.Model.HotelRoom;
import com.geekster.HotelManagementgeekster.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("rooms")
    public Iterable<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom hotelRoom){
        return roomService.addRoom(hotelRoom);
//        return "Room has been added!";
    }
}
