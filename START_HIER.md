# Milestone 1 Schritt für Schritt

## 1. Projekt in IntelliJ öffnen

1. Die heruntergeladene ZIP-Datei entpacken (auf dem Mac im Finder doppelklicken).
2. In IntelliJ **Open** oder **File → Open** wählen.
3. Den entpackten Ordner `studytasks-backend` öffnen. Darin liegt direkt die Datei `pom.xml`.
4. Falls angezeigt, **Trust Project** und **Load Maven Project** wählen.
5. Unter **File → Project Structure → Project** ein JDK 21 als SDK auswählen. Falls nötig, über **Download JDK** installieren.
6. Abwarten, bis IntelliJ die Maven-Abhängigkeiten geladen hat. Falls das Projekt nicht als Maven-Projekt erkannt wurde: Rechtsklick auf `pom.xml` → **Add as Maven Project**.

## 2. README ausfüllen

In `README.md` deinen Namen, Übungsgruppe, Dozent/in und Repository-Link eintragen und speichern. Die Projektbeschreibung ist bereits enthalten.

## 3. Starten und prüfen

1. Links `src → main → java → de.studytasks → StudyTasksApplication` öffnen.
2. Auf das grüne Dreieck neben `main` klicken und **Run** wählen.
3. In der Ausgabe sollte `Started StudyTasksApplication` erscheinen.
4. Im Browser <http://localhost:8080/api/tasks> öffnen. Erwartet wird eine Liste mit drei Aufgaben, beginnend mit „Milestone 1 abgeben“.
5. Optional `src/test/java/de/studytasks/TaskEndpointTest.java` über das grüne Dreieck ausführen.

Bei einer Fehlermeldung den genauen Text kopieren. „Port 8080 already in use“ bedeutet beispielsweise, dass bereits ein Programm diesen Port verwendet.

## 4. In dein bestehendes GitHub-Repository hochladen

Für den ersten Upload kannst du die GitHub-Webseite verwenden:

1. Dein Backend-Repository im Browser öffnen und zur Ansicht **Code** wechseln.
2. **Add file → Upload files** wählen. Bei einem ganz leeren Repository gibt es stattdessen den Link **uploading an existing file**.
3. Aus dem entpackten Projektordner `pom.xml`, `README.md`, `START_HIER.md` und den Ordner `src` auf die Upload-Fläche ziehen. Den Inhalt des Projektordners hochladen, nicht die ZIP-Datei und nicht den äußeren Ordner.
4. Falls das Repository schon ein README enthält: Nur ersetzen, wenn du dessen bisherige Inhalte nicht mehr brauchst; ansonsten die vorhandenen Angaben in das neue README übernehmen.
5. Als Commit-Nachricht `StudyTasks: Milestone 1 mit GET-Route` eintragen und **Commit changes** wählen.
6. Auf der Hauptseite des Repositorys prüfen: `pom.xml` und `src` müssen direkt auf der obersten Ebene stehen. `src/main/java/de/studytasks/controller/TaskController.java` muss erreichbar sein. Das README sollte darunter angezeigt werden.
7. `.gitignore` ebenfalls hochladen, sofern dein Dateidialog sie anzeigt. Alternativ auf GitHub über **Add file → Create new file** eine Datei namens `.gitignore` mit dem Inhalt der mitgelieferten Datei erstellen.

Keine `target`- oder `.idea`-Ordner hochladen. Für die spätere Weiterentwicklung kann das Repository regulär mit Git geklont werden.

## 5. Abgeben

- Team-Mitglied: dein vollständiger Name.
- Projektname: StudyTasks.
- Übungsgruppe und Dozent/in: deine Angaben.
- Link: die Hauptseite deines Backend-Repositorys.

Die Dateien sind eine vorbereitete Grundlage. Die Abgabe ist erst vollständig, wenn du die Angaben ergänzt, den Start geprüft und den Code auf GitHub hochgeladen hast. Einzelarbeit gegebenenfalls mit dem Dozenten klären, da die Aufgabenstellung Zweier-Teams nennt.
