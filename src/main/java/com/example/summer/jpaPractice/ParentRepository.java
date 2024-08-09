package com.example.summer.jpaPractice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParentRepository extends JpaRepository<Parent, String> {
    Optional<Parent> findByName(String name);//Name 자리에는 필드명으로
}
