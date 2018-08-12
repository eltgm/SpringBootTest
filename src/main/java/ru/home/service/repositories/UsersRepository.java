package ru.home.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.service.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {

}
