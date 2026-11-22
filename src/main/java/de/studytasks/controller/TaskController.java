package de.studytasks.controller;

import de.studytasks.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "https://studytasks-frontend.onrender.com")
public class TaskController {
    @GetMapping
    public List<Task> getTasks() {
        return List.of(
            new Task(1L, "Milestone 1 abgeben", "Backend und Projektbeschreibung auf GitHub hochladen.", LocalDate.of(2026, 10, 18), false),
            new Task(2L, "Mathe-Übungsblatt bearbeiten", "Aufgaben 1 bis 4 lösen.", LocalDate.of(2026, 10, 23), false),
            new Task(3L, "Projektidee festlegen", "StudyTasks als Aufgabenplaner für Studierende auswählen.", LocalDate.of(2026, 10, 16), true)
        );
    }
}
