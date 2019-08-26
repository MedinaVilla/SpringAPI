package com.microservice.training.countriesdemo.service;

import com.microservice.training.countriesdemo.model.Continent;
import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.repository.api.CountryJpaRepository;
import com.microservice.training.countriesdemo.service.api.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CountriesService implements ICountriesService {

  @Autowired
  CountryJpaRepository countriesRepository;
  
  public List<CountryEntity> findCountriesByContinentName(String continentName) {
    return countriesRepository.findByContinent(continentName);

  }

  public List<CountryEntity> findCountriesByContinentId(Integer continentId) {
    Continent continent = Continent.continentById(continentId);
    String continentFounded = String.valueOf(continent);
    return countriesRepository.findByContinent(continentFounded);
  }

  public Optional<CountryEntity> findCountryById(Integer countryId){
    return countriesRepository.findById(countryId);

  }

  @Override
  public List<CountryEntity> saveCountry(CountryEntity country) {
    countriesRepository.save(country);
    return countriesRepository.findAll();
  }

}