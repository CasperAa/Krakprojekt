package com.example.demokrak2.configuration;

import com.example.demokrak2.entity.Person;
import com.example.demokrak2.repository.PersonRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("!test")
public class makeTestData implements ApplicationRunner {

    PersonRepository memberRepository;

    public makeTestData(PersonRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void makeData(){
        Person m1 = memberRepository.save(new Person("amanda@amanda.dk", "Amanda", "Amandasen", "70121416"));
        Person m2 = memberRepository.save(new Person("casper@casper.co.uk", "Casper", "Caspersen", "88888888"));

        System.out.println("--------------Testdata kørt--------------");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        memberRepository.deleteAll();

        makeData();

    }
}
