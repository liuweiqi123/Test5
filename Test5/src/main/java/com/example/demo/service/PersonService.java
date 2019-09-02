package com.example.demo.service;

import com.example.demo.bean.Person;


import java.util.List;


public interface PersonService {
    //查询所有
     List<Person> findAll();

    //新增
     List<Person> addPerson(Person person);

     List<Person> findByCode(String userCode);
}
