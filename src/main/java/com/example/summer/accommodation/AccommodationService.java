package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

//    public Room addRoom(Room room) {
//
//    }
}
