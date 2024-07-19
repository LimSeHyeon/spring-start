package com.example.summer.accomodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccommodationService {
    AccommodationRepository accommodationRepository;

    @Autowired
    AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public Accommodation getAccomodationName(int id) {
        return accommodationRepository.findProduct(id);
    }

    public Accommodation addAccomodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }
}
