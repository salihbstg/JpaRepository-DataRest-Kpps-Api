package com.example.kpssdemo.dao;

import com.example.kpssdemo.entity.Turkish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "turkish")
public interface TurkishDAO extends JpaRepository<Turkish,Integer> {
}
