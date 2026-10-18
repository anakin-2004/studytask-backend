package de.studytasks.model;

import java.time.LocalDate;

/** Beschreibt eine Studienaufgabe. Die Datenbankanbindung folgt später. */
public class Task {
    private final Long id;
    private final String title;
    private final String description;
    private final LocalDate dueDate;
    private final boolean completed;

    public Task(Long id, String title, String description, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public LocalDate getDueDate() { return dueDate; }
    public boolean isCompleted() { return completed; }
}
