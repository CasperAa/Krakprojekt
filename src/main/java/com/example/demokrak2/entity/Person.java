package com.example.demokrak2.entity;

import com.example.demokrak2.dto.PersonRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Person {
    @Id
    private String email;

    String firstName;

    String lastName;

    @Column(length = 20)
    String phone;

    public Person(){}


    public Person(String email, String firstName, String lastName, String phone) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public Person(PersonRequest body) {
    }
}

