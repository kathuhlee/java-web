package com.example.java_web_final_project;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final CatRepository catRepository;

    public CatService(CatRepository catRepository){
        this.catRepository = catRepository;
    }

    public List<Cat> all() {
        return catRepository.findAll();
    }

    public void add(Cat cat) {
        catRepository.save(cat);
    }

}
