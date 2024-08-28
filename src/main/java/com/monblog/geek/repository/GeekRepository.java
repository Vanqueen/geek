package com.monblog.geek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monblog.geek.model.Geek;

@Repository
public interface GeekRepository extends JpaRepository<Geek, Long> {


    
}
