package com.project.bm.repository;


import com.project.bm.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Integer> {
}
