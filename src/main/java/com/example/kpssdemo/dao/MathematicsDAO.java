package com.example.kpssdemo.dao;

import com.example.kpssdemo.entity.Mathematics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "math")
public interface MathematicsDAO extends JpaRepository<Mathematics,Integer> {

}
