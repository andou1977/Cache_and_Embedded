package com.example.trytotry.controller;

import com.example.trytotry.entity.TryEntity;
import com.example.trytotry.entity.TryEntityAdresse;
import com.example.trytotry.repository.TryRepositories;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableCaching
public class TryController {
    TryRepositories repository;

    public TryController(TryRepositories repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
     @Cacheable("data")
    public TryEntity save(TryEntity entity) {
        System.out.println("-----------appelle - moi-------------");
        return repository.save(entity);
    }

    @GetMapping("/list")
    @Cacheable("data")
    @ResponseStatus(HttpStatus.CREATED)
    public List<TryEntity> list(){
        System.out.println("-----------liste - moi-------------");
        return repository.findAll();
    }

}
