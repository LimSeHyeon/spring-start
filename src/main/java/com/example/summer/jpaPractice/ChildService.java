package com.example.summer.jpaPractice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChildService {

    private final ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    @Transactional
    public void save(Child child) {
        childRepository.save(child);
    }
}
