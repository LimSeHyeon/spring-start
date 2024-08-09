package com.example.summer.jpaPractice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ParentService {

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Transactional
    public void save(Parent parent) { parentRepository.save(parent); }


}
