package com.microservice.training.countriesdemo.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;

@Repository
public interface CountryJpaRepository extends JpaRepository<CountryEntity, Integer> {
    List<CountryEntity> findByContinent(String continent);

}
