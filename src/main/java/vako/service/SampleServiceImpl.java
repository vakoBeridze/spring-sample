package vako.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vako.dao.SampleDao;
import vako.domain.Person;

/**
 * Created by abesalomi.
 * Created at 3/9/15 11:31 AM.
 * Created for spring-sample.
 */
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleDao repository;

    @Override
    public Person generatePerson(){

        Person person = new Person();

        person.setName("Vako Beridze");

        person.setAge(23);

        repository.insert(person);

        return person;
    }

}
