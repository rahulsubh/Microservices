package com.rahul.Hotel.services;

import com.rahul.Hotel.entities.Hotel;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface HotelService {
    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String id);
}
