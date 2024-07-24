package com.example.summer.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

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

    public Accommodation getAccomodation(int id) throws NoSuchElementException {
        return accommodationRepository.getAccommodation(id);

    }

    public Accommodation addAccomodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }

    public Accommodation addRooms(Room[] rooms) {
        int hotelId = rooms[0].getAccommodationId();
        Accommodation updatedAccommodation = accommodationRepository.getAccommodation(hotelId);
        ArrayList<Room> existRooms = updatedAccommodation.getRooms();

        // 방 목록이 null이면 새 리스트로 초기화
        if (existRooms == null) {
            existRooms = new ArrayList<>();
            updatedAccommodation.setRooms(existRooms);
        }
        existRooms.addAll(Arrays.asList(rooms));
        accommodationRepository.saveProduct(updatedAccommodation);
        return updatedAccommodation;
    }
}
