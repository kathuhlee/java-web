package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CatController {
    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getCats() {
        return catService.all();
    }

    @PostMapping
    public void addSong(@RequestBody Cat cat) {
        catService.add(cat);
    }
}
