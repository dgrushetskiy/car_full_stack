package ru.gothmog.carappserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.gothmog.carappserver.model.Car;

import java.util.List;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
    // Fetch cars by brand
    List<Car> findByBrand(@Param("brand") String brand);

    // Fetch cars by color
    List<Car> findByColor(@Param("color") String color);
}
