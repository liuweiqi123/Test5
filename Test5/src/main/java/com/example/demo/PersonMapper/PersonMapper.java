package com.example.demo.PersonMapper;

import com.example.demo.bean.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import javax.xml.bind.annotation.XmlID;
import java.util.List;

@Mapper
public interface PersonMapper {

    //新增
    @Insert("insert into person(userCode,userName,department) values (#{userCode},#{userName},#{department})")
    void addPerson(Person person);
    //查找所有
    @Select("select * from person")
    List<Person> findAll();

    //查找单个id的值
    @Select("select * from person where userCode=#{userCode}")
    List<Person> findByCode(String userCode);
}
