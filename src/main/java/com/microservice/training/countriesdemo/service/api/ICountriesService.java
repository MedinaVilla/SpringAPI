package com.microservice.training.countriesdemo.service.api;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import java.util.List;
import java.util.Optional;

public interface ICountriesService {
  List<CountryEntity> findCountriesByContinentName(String continentName);

  List<CountryEntity> findCountriesByContinentId(Integer continentId);

  Optional<CountryEntity> findCountryById(Integer countryId);

  List<CountryEntity> saveCountry(CountryEntity country);

}
