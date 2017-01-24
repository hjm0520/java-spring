package com.app.repository;

import com.app.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ekansh on 14/7/15.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {

}
