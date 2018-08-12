package ru.home.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.service.models.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {
}
