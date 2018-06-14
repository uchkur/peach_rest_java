package ru.uchkur.repositories;

import ru.uchkur.model.Operation;
import ru.uchkur.repositories.custom.GenericRepository;

/**
 * Spring Data repository interface for {@link Operation} entity. Implementation is created by spring.
 * 
 * @author Ignas
 * 
 */
public interface OperationRepository extends GenericRepository<Operation, Long> {

}
