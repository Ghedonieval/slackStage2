package com.example.SlackStage2;

import com.example.SlackStage2.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    public Person findById(int id);

    public Person findByName(String name);

}
