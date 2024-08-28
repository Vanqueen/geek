package com.monblog.geek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monblog.geek.model.Geek;
import com.monblog.geek.repository.GeekRepository;


@RestController
@RequestMapping("/api/geeks")
public class GeekController {

    @Autowired
    private GeekRepository geekRepository;

    @GetMapping
    public List<Geek> getAllGeeks() {
        return geekRepository.findAll();
    }

    @PostMapping
    public Geek createGeek(@RequestBody Geek geek) {
        return geekRepository.save(geek);
    }

    @PutMapping("/{id}")
    public Geek updateGeek(@PathVariable Long id, @RequestBody Geek geekDetail) {
        Geek geek = geekRepository.findById(id).orElseThrow();
        geek.setName(geekDetail.getName());
        geek.setPrice(geekDetail.getPrice());
        return geekRepository.save(geek);
    }

    @DeleteMapping("/{id}")
    public void deleteGeek(@PathVariable Long id) {
        Geek geek = geekRepository.findById(id).orElseThrow();
        geekRepository.delete(geek); 
    }

}
