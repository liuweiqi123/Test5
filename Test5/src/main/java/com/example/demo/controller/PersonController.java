package com.example.demo.controller;

import com.example.demo.PersonMapper.PersonMapper;
import com.example.demo.bean.Data;
import com.example.demo.bean.Person;
import com.example.demo.service.PersonService;
import jdk.nashorn.internal.ir.RuntimeNode;
import net.sf.json.JSONObject;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@CrossOrigin
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonMapper personMapper;



    @RequestMapping("index")
    public String index(){
        return "index";
    }
//    @ResponseBody
//    @PostMapping("person")
//    public Person getData(@RequestBody JSONObject jsonobject) {
//        System.out.println(jsonobject);
//        return Data.getPersonByUsercode((jsonobject.getString("usercode")));
//    }


    //查询所有数据
    @ResponseBody
    @RequestMapping("all")
    public List<Person> findAll(){
        System.out.println("开始查询所有数据...");
        return personService.findAll();
    }

    //通过id查找对应数据
    @ResponseBody
    @RequestMapping("findId")
    public List<Person> getData1(@RequestBody JSONObject jsonobject) {
        System.out.println(jsonobject);
        return personService.findByCode((jsonobject.getString("usercode")));
    }

    //页面添加数据
    @ResponseBody
    @RequestMapping("add")
    public List<Person> addRole(Person person){
        System.out.println("开始新增...");
        return personService.addPerson(person);
    }

    //person页面信息查看
    @RequestMapping("/personInfo")
    public String personHtml(Model model){
        List<Person> personAll = personMapper.findAll();
        model.addAttribute("personAll",personAll);
        return "PersonInfo.html";
    }

}
