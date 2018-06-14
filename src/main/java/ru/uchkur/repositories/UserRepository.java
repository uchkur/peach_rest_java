package ru.uchkur.repositories;

import ru.uchkur.model.User;
import ru.uchkur.repositories.custom.GenericRepository;

/**
 * Spring Data repository interface for {@link User} entity. Implementation is created by spring.
 * 
 * @author uchkur
 * 
 */
public interface UserRepository extends GenericRepository<User, Long> {

}
