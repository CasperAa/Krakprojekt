package com.example.demokrak2.api;
import com.example.demokrak2.dto.PersonRequest;
import com.example.demokrak2.dto.PersonResponse;
import com.example.demokrak2.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/person")

public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonResponse> getPersons (){
        return personService.getPersons();
    }

    /*
    @PostMapping("/{id}")
    public PersonResponse addPerson(@RequestBody PersonRequest body) throws Exception {
        return personService.addPerson(body);
    }

    @PutMapping("/{id}")
    public PersonResponse updatePerson(@RequestBody PersonRequest body, @PathVariable String id){
        return personService.updatePerson(body,id);
    }


    @DeleteMapping("/{email}")
    public void deleteMember(@PathVariable String email) {
        personService.deletePerson(email);
    }

     */

}

