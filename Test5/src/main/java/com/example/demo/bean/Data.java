package com.example.demo.bean;

import java.util.HashMap;
import java.util.Map;

public class Data {
    public static Map<String, Person> persons = null;
    static {
        persons = new HashMap<String , Person>();
//        persons.put("1",new Person("1","刘炜琪","技术开发部"));
//        persons.put("2",new Person("2","李四","人力资源部"));
//        persons.put("3",new Person("3","王五","产品研发部"));
//        persons.put("4",new Person("4","马六","共享交付部"));
        persons.put("1",new Person("304","黑子","技术开发部"));

    }

    public static Person getPersonByUsercode(String usercode){
        return persons.get(usercode);
    }
}
