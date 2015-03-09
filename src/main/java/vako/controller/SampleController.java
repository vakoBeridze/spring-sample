package vako.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vako.domain.Person;
import vako.service.SampleService;

/**
 * Created by abesalomi.
 * Created at 3/9/15 11:13 AM.
 * Created for spring-sample.
 */
@RestController
@RequestMapping("/test")
public class SampleController {


    @Autowired
    private SampleService service;

    @RequestMapping("say-hello")
    public String sayHello(){
        return "Hello from traki";
    }



    @RequestMapping("person")
    public Person person(){
        return service.generatePerson();
    }




}
