package org.orlov.tom.repository;
import org.orlov.tom.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {
    // Можно добавлять дополнительные методы, если необходимо
}

