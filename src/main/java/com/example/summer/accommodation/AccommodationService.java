package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AccommodationService {
    AccommodationRepository accommodationRepository;

    @Autowired
    AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public List<Accommodation> getAll() {
        return accommodationRepository.findAll();
    }

    public Accommodation getAccomodationName(int id) {
        return accommodationRepository.findProduct(id);
    }

    public Accommodation addAccomodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }

    public Accommodation addRooms(Room[] rooms) {
        int hotelId = rooms[0].getAccommodationId();
        Accommodation updatedAccommodation = accommodationRepository.findProduct(hotelId);
        ArrayList<Room> tmp;
        for(Room : rooms) {

        }
        updatedAccommodation.getRooms().addAll(Arrays.asList(rooms));
        return updatedAccommodation;
    }
}
