package ru.uchkur.services;

import ru.uchkur.model.User;
import ru.uchkur.repositories.UserRepository;
import ru.uchkur.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
@Service ("userService")
public class UserService extends BaseService<User> {
    private static final long serialVersionUID = 1L;
    @Autowired
    private UserRepository repository;
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    protected JpaRepository<User, Long> getRepository(){
        return (JpaRepository) repository;
    }
}


