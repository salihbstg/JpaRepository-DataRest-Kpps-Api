package com.example.kpssdemo.dao;

import com.example.kpssdemo.entity.Geography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "geography")
public interface GeographyDAO extends JpaRepository<Geography,Integer> {
}
