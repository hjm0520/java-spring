package com.app.service;

import com.app.dao.PersonDAO;
import com.app.domain.Person;
import com.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ekansh on 13/7/15.
 */
@Service
public class PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private PersonRepository personRepository;

    public Object findAll(){
        return personRepository.findAll();
    }

    public Person findById(Long id){
        return personRepository.findOne(id);
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

}
