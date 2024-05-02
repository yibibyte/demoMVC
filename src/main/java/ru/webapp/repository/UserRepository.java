package ru.webapp.repository;

import org.springframework.stereotype.Repository;
import ru.webapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}