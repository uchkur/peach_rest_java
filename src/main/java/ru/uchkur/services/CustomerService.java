package ru.uchkur.services;

import ru.uchkur.model.Customer;
import ru.uchkur.repositories.CustomerRepository;
import ru.uchkur.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Service implementation for Customer.
 * 
 * @author Ignas
 *
 */
@Service("customerService")
public class CustomerService extends BaseService<Customer> {

    private static final long serialVersionUID = 1L;
    
    /** Injected repository. */
    @Autowired
    private CustomerRepository repository;
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    protected JpaRepository<Customer, Long> getRepository() {
        return (JpaRepository) repository;
    }

}
