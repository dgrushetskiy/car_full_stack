package ru.gothmog.carappserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gothmog.carappserver.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
