package com.Hotel.controller;

import com.Hotel.entity.Hotel;
import com.Hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1=this.hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getByHotelId(@PathVariable String id)
    {
        Hotel hotel=this.hotelService.getHotelById(id);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }
    @GetMapping("/")
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
        List<Hotel> allHotel=this.hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(allHotel);
    }


}
