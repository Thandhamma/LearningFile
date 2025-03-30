package com.Thandhamma.crudapp.respository;
import com.Thandhamma.crudapp.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class PersonRespository implements PersonDAO{
    private EntityManager entityManager;

    @Autowired
    public PersonRespository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Person person){
        entityManager.persist(person);
    }
}
