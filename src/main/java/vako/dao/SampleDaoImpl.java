package vako.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vako.domain.Person;

/**
 * Created by abesalomi.
 * Created at 3/9/15 11:35 AM.
 * Created for spring-sample.
 */
@Repository
@Transactional
public class SampleDaoImpl implements SampleDao{

    @Autowired
    SessionFactory factory;

    @Override
    public Person insert(Person person){
        factory.getCurrentSession().save(person);
        return person;
    }

}
