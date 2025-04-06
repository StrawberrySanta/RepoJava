package org.orlov.tom.notesservice.repository;

import org.orlov.tom.notesservice.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // Можно добавлять дополнительные методы, если необходимо
}
