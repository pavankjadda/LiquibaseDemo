package com.pj.liquibasedemo.web;

import com.pj.liquibasedemo.domain.Country;
import com.pj.liquibasedemo.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Provides API endpoints for Country and related operations
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/country")
public class CountryController
{
  private final CountryRepository countryRepository;

  public CountryController(CountryRepository countryRepository)
  {
    this.countryRepository = countryRepository;
  }

  /**
   * Finds all countries in the database
   *
   * @return List of countries
   *
   * @author Pavan Kumar Jadda
   * @since 1.0.0
   */
  @GetMapping(path = "/list")
  public List<Country> findAllCountries()
  {
    return countryRepository.findAll();
  }

  /**
   * Create a new country in the database and returns the newly created country
   *
   * @return Newly created country
   *
   * @author Pavan Kumar Jadda
   * @since 1.0.0
   */
  @GetMapping(path = "/create")
  public Country createCountry()
  {
    Country country = new Country();
    country.setCode("USD");
    country.setIsoCode("USD");
    country.setName("United States Dollar");


    return countryRepository.saveAndFlush(country);
  }
}
