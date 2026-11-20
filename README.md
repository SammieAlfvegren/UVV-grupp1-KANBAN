# Kanban Board

## Projektidé

Vi ska skapa en textbaserad Kanban-tavla i Java.

Programmet ska fungera ungefär som Trello eller GitHub Projects, men köras i terminalen.

Användaren ska kunna:

- Skapa uppgifter
- Visa alla uppgifter
- Flytta uppgifter mellan olika kolumner
- Ta bort uppgifter
- Spara uppgifter mellan körningar

Kolumner:

- TODO
- IN_PROGRESS
- DONE

Exempel:

```text
==================================================
                     TODO
==================================================

[2] Skriva tester

==================================================
                 IN_PROGRESS
==================================================

[1] Skriva README

==================================================
                     DONE
==================================================

(Inga uppgifter)
```

## Projektstruktur

```text
UVV-grupp1-KANBAN
│
├── README.md
├── pom.xml
├── .gitignore
├── tasks.txt
│
└── src
    ├── main
    │   └── java
    │       └── se.uvvgrupp1.kanban
    │           ├── Main.java
    │           ├── Task.java
    │           ├── Status.java
    │           ├── KanbanBoard.java
    │           └── TaskManager.java
    │
    └── test
        └── java
            └── se.uvvgrupp1.kanban
                ├── TaskTest.java
                ├── KanbanBoardTest.java
                └── TaskManagerTest.java
```

## Klassbeskrivningar

### Main

Programmets startpunkt.

Ansvarar för:

- Menyer
- Användarens val
- Inmatning från tangentbordet
- Att koppla ihop resten av programmet

Exempel:

```text
1. Visa tavla
2. Skapa uppgift
3. Flytta uppgift
4. Ta bort uppgift
5. Avsluta
```

### Task

Representerar en uppgift på tavlan.

Varje uppgift innehåller:

- Ett ID
- En titel
- En status

Exempel:

```text
ID: 1
Titel: Skriva README
Status: TODO
```

### Status

Anger vilken kolumn en uppgift ligger i.

Möjliga statusar:

```text
TODO
IN_PROGRESS
DONE
```

Exempel:

```text
Skriva README -> TODO
Skriva tester -> IN_PROGRESS
Skapa GitHub-repo -> DONE
```

### KanbanBoard

Representerar själva tavlan.

KanbanBoard håller reda på alla uppgifter som finns i systemet.

Exempel:

```text
TODO
- Skriva README

IN_PROGRESS
- Skriva tester

DONE
- Skapa GitHub-repo
```

### TaskManager

Ansvarar för programmets logik.

TaskManager används när användaren vill:

- Skapa uppgifter
- Flytta uppgifter
- Ta bort uppgifter


TaskManager fungerar som länken mellan användaren och tavlan.

### TaskFileManager

- Läsa från tasks.txt
- Skriva till tasks.txt

### tasks.txt

Innehåller alla sparade uppgifter.

Exempel:

```text
1;Skriva README;TODO
2;Skriva tester;IN_PROGRESS
3;Skapa GitHub-repo;DONE
```

Filen läses in när programmet startar och uppdateras när uppgifter ändras.


## Framtida funktioner

Om tid finns kan vi lägga till:

- Prioritet på uppgifter

