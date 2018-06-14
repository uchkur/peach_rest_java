package ru.uchkur.repositories;

import ru.uchkur.model.Account;
import ru.uchkur.repositories.custom.GenericRepository;

/**
 * Spring Data repository interface for {@link Account} entity. Implementation is created by spring.
 * 
 * @author Ignas
 * 
 */
public interface AccountRepository extends GenericRepository<Account, Long> {

}
