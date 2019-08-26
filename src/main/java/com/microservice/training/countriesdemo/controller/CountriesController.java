package com.microservice.training.countriesdemo.controller;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class CountriesController {

  @Autowired
  CountriesService countriesService;

  @GetMapping(path = "/api/countries/continent/name/{continentName}")
  public ResponseEntity<List<CountryEntity>> findCountryByContinent(@PathVariable String continentName) {
    return new ResponseEntity<List<CountryEntity>>(countriesService.findCountriesByContinentName(continentName),
        HttpStatus.OK);
  }

  @GetMapping(path = "/api/countries/continent/id/{continentId}")
  public ResponseEntity<List<CountryEntity>> findCountryByContinent(@PathVariable Integer continentId) {
    return new ResponseEntity<List<CountryEntity>>(countriesService.findCountriesByContinentId(continentId),
        HttpStatus.OK);
  }

  @GetMapping(path = "/api/country/id/{countryId}")
  public ResponseEntity<Optional<CountryEntity>> findCountryById(@PathVariable Integer countryId) {
    return new ResponseEntity<Optional<CountryEntity>>(countriesService.findCountryById(countryId), HttpStatus.OK);
  }

  @PostMapping(path = "/api/continent/country", consumes = "application/json", produces = "application/json")
  public ResponseEntity<List<CountryEntity>> saveCountry(@RequestBody CountryEntity country) {
    return new ResponseEntity<List<CountryEntity>>(countriesService.saveCountry(country), HttpStatus.OK);
  }

}
