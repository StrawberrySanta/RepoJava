package org.orlov.tom.notesservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    public void setNotes(String text)
    {
        this.text = text;
    }

    public String getNotes() {
        return text;
    }
}
