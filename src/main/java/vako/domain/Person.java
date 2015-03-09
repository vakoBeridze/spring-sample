package vako.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by abesalomi.
 * Created at 3/9/15 11:33 AM.
 * Created for spring-sample.
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable{




    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "PERSON_SEQ_GEN", sequenceName = "PERSON_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_SEQ_GEN")
    private long id;

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
