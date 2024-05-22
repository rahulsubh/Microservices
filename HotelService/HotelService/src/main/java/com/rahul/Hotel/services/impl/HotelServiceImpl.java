package com.rahul.Hotel.services.impl;

import com.rahul.Hotel.entities.Hotel;
import com.rahul.Hotel.exceptions.ResourceNotFoundException;
import com.rahul.Hotel.repositories.HotelRepository;
import com.rahul.Hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository
                .findById(id).orElseThrow(() -> new ResourceNotFoundException("hotel with given id not found !!"));
    }
}
