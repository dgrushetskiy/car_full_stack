package ru.gothmog.carappserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gothmog.carappserver.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
