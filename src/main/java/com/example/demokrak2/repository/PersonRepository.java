package com.example.demokrak2.repository;

import com.example.demokrak2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, String> {

   @Query("select (count(m) > 0) from Person m where m.email = :email")
    boolean emailExist(String email);

    void deleteById(String email);
}
