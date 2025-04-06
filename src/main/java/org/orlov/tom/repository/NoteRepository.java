package org.orlov.tom.repository;

import org.orlov.tom.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Можно добавлять дополнительные методы, если необходимо
}
