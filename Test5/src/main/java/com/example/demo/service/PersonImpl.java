package com.example.demo.service;


import com.example.demo.PersonMapper.PersonMapper;
import com.example.demo.bean.Data;
import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;



    @Override
    public List<Person> findAll(){
        return this.personMapper.findAll();
    }


    @Override
    public List<Person> addPerson(Person person) {
        try {
            for(int i=1;i<=Data.persons.size();i++) {
                person.setUserCode(Data.getPersonByUsercode(String.valueOf(i)).getUserCode());
                person.setUserName(Data.getPersonByUsercode(String.valueOf(i)).getUserName());
                person.setDepartment(Data.getPersonByUsercode(String.valueOf(i)).getDepartment());
                personMapper.addPerson(person);
            }
        }catch (Exception e){
            e.getMessage();
        }
        return findAll();
    }

    @Override
    public List<Person> findByCode(String userCode) {
        return  personMapper.findByCode(userCode);
    }
}
