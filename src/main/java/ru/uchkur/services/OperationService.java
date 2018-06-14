package ru.uchkur.services;

import ru.uchkur.model.Operation;
import ru.uchkur.repositories.OperationRepository;
import ru.uchkur.services.base.BaseService;
import ru.uchkur.services.base.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Service implementation for Operation.
 * 
 * @author Ignas
 *
 */
@org.springframework.stereotype.Service("operationService")
public class OperationService extends BaseService<Operation> implements Service<Operation> {

    private static final long serialVersionUID = 1L;

    /** Injected repository. */
    @Autowired
    private OperationRepository repository;
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    protected JpaRepository<Operation, Long> getRepository() {
        return (JpaRepository) repository;
    }
}
