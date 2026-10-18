# StudyTasks – Aufgabenplaner für Studierende

## Projektangaben

- **Teammitglied:** Anakin Timm
- **Projektname:** StudyTasks

## Projektbeschreibung

StudyTasks ist eine Web-Anwendung zur Verwaltung von Studienaufgaben und Abgabeterminen. Geplant sind das Erstellen, Anzeigen, Bearbeiten und Löschen von Aufgaben sowie das Markieren als erledigt.

## Milestone 1

Das Spring-Boot-Backend stellt über `GET /api/tasks` eine Liste mit drei fest hinterlegten Beispielaufgaben als JSON bereit.

Die Klasse `Task` beschreibt eine Aufgabe mit ID, Titel, Beschreibung, Abgabedatum und Erledigungsstatus. Eine Datenbankanbindung ist in diesem Stand noch nicht implementiert.

Für das Gesamtprojekt sind Java mit Spring Boot, Vue.js, Managed PostgreSQL und das Deployment auf Render vorgesehen.