package com.prueba.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Celular;

@Repository
public interface ICelularRepo extends JpaRepositoryImplementation<Celular, Integer> {

}
