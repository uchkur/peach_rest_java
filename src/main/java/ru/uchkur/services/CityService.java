package ru.uchkur.services;

import ru.uchkur.model.City;
import ru.uchkur.repositories.CityRepository;
import ru.uchkur.services.base.BaseService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Service implementation for City.
 * 
 * @author Ignas
 *
 */
@org.springframework.stereotype.Service("cityService")
public class CityService extends BaseService<City> implements Service<City> {

    private static final long serialVersionUID = 1L;

    /** Injected repository. */
    @Autowired
    private CityRepository repository;
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    protected JpaRepository<City, Long> getRepository() {
        return (JpaRepository) repository;
    }
}
