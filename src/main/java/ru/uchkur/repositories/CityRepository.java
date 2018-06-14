package ru.uchkur.repositories;

import ru.uchkur.model.City;
import ru.uchkur.repositories.custom.GenericRepository;

/**
 * Spring Data repository interface for {@link City} entity. Implementation is created by spring.
 * 
 * @author Ignas
 * 
 */
public interface CityRepository extends GenericRepository<City, Long> {

}
