package ru.uchkur.repositories;

import ru.uchkur.model.Customer;
import ru.uchkur.repositories.custom.GenericRepository;

/**
 * Spring Data repository interface for {@link Customer} entity. Implementation is created by spring.
 * 
 * @author Ignas
 *
 */
public interface CustomerRepository extends GenericRepository<Customer, Long> {
}