package com.example.kpssdemo.dao;

import com.example.kpssdemo.entity.GeneralKnowledge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "generalknowledge")
public interface GeneralKnowledgeDAO extends JpaRepository<GeneralKnowledge,Integer> {
}
