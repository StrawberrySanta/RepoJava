package org.orlov.tom.notesservice.repository;
import org.orlov.tom.notesservice.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {
    // Можно добавлять дополнительные методы, если необходимо
}

