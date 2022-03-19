package com.example.demokrak2.service;

import com.example.demokrak2.dto.PersonRequest;
import com.example.demokrak2.dto.PersonResponse;
import com.example.demokrak2.entity.Person;
//import com.example.demokrak2.error.Client4xxException;
import com.example.demokrak2.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonService {

    PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository=personRepository;
    }

    public List<PersonResponse> getPersons(){
        List<Person> persons = personRepository.findAll();
        return  PersonResponse.getPersonEntities(persons);
    }
    /*

    public PersonResponse addPerson(PersonRequest body) throws Exception {

        //Kun, hvis e-mail skal være unik
        if (personRepository.emailExist(body.getEmail())) {
            throw new Exception("Provided email is taken");
        }
        Person personNew = personRepository.save(new Person(body));
        return new PersonResponse(personNew,true,true);
    }





    //Til denne metode skal der huskes at lave en constructure i PersonResponse
    public PersonResponse updatePerson (PersonRequest personToEdit, String personId){
        Person personUpdated = personRepository.findById(personId).orElseThrow(()-> new Client4xxException("No person with provided ID found" + personId));
        personUpdated.setEmail(personToEdit.getEmail());
        personUpdated.setFirstName(personToEdit.getFirstName());
        personUpdated.setLastName(personToEdit.getLastName());
        personUpdated.setPhone(personToEdit.getPhone());

        return new PersonResponse(personRepository.save(personUpdated));
    }

    public void deletePerson(String email){
        personRepository.deleteById(email);
    }

     */

}


