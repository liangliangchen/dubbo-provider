package me.spring.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.spring.springboot.domain.Person;
import me.spring.springboot.service.PersonService;

@Service(version = "0.0.1")
public class PersonServiceImpl implements PersonService {
    @Override
    public Person getPersonById(Long id) {
        return new Person(1L, "zhangsan", 21);
    }
}
