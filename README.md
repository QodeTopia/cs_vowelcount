# Zähle Umlaute – Die Vokal-Challenge mit Emil

![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

TODO Hinweis zum video (Link) und zur Videoreihe :)
TODO Hinweis: Bitte erst alles lesen und dann anfangen :)

## Challenge

> Emil hat sich beim Singen total verausgabt – und will wissen, wie viele „Aaaaahs“ er rausgebrüllt hat.  
Zähle alle Vokale (`a`, `e`, `i`, `o`, `u` – Groß und Klein) in einem beliebigen Text.

![](https://img.shields.io/badge/Java-red)
![](https://img.shields.io/badge/Grundlagen-blue)
![](https://img.shields.io/badge/Strings-purple)

---

## 🧠 Was du dabei lernst

- Umgang mit Strings in Java
- Schleifen & Bedingungen
- Zeichen zählen & vergleichen

---

## 📋 Deine Aufgabe

1. Schau dir die Klasse [Vokale](./Vokale.java) an und implementiere dort die Logik
1. Die Methode soll die Gesamtanzahl an Vokale ausgeben
1. **Beispiel**:  
Eingabe: "Emil liebt Java"  
Ausgabe: 6
1. Du kannst zur Überprüfung die Testklasse [VokaleTest](./VokaleTest.java) ausführen.
1. **ODER**: Du implementierst eine `Main-Methode`, welche die Methode `Vokale.getCount(String)` aufruft und überprüfe das Ergebnis manuell 
---

## 🧩 Bonus-Ideen (wenn du weiter gehen willst)

- Zähle Umlaute (`ä`, `ö`, `ü`)
- Nur Vokale zählen, die _nicht doppelt_ vorkommen
- Gib die Anzahl jedes Vokal zusätzlich aus, z.B. `a: 5`
- Benutze Java-Streams oder wenn du sie bereits verwendet hast, versuche es ohne. 

---

## 💬 Mach mit!

- Forke dieses Repo
- Löse die Aufgabe in deiner eigenen Datei (z.B. `Main.java`)
- Poste deine Lösung als Kommentar unter [diesem YouTube-Video](https://youtube.com/@QodeTopia) (Link folgt)

---

## 🧪 Lernmaterial

📺 Schau dir das passende Video auf YouTube an:  
👉 [QodeTopia – Emil lernt zählen](https://youtube.com/@QodeTopia)

Alternativ schau dir die String-Dokumentation an: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html.
Insbesondere die Methoden
    - `indexOf(...)`
    - `toCharArray()`

Zusätzlich kann dir das helfen: https://www.baeldung.com/foreach-java

---

### Du brauchst Hilfe?

Du kannst hier (TODO Link) ein Issue anlegen und mir dein Problem schildern, und dir wird dann weitergeholfen.

Alternativ kannst du Emil eine E-Mail schreiben: `emil@open-email.de`

---

## 🧑‍💻 Beispiel-Lösung (nur anschauen, wenn du festhängst)

Im Ordner `loesung/` findest du mehrere Lösungen.  
Aber: Versuch's erst selbst – Emil hat’s auch nicht auf Anhieb geschafft. 😅


## Drittanbieter-Komponenten

Dieses Projekt enthält folgende Bibliotheken von Drittanbietern:

**JUnit** (`lib/junit-4.13.1.jar`)  
Lizenz: [Eclipse Public License 1.0](https://www.eclipse.org/legal/epl-v10.html)  
Siehe `lib/LICENSE-junit4.txt` für den vollständigen Lizenztext.

**Hamcrest Core** (`lib/hamcrest-core-1.3.jar`)  
Copyright © 2000–2006, www.hamcrest.org  
Lizenz: BSD 2-Clause  
Siehe `lib/LICENSE-hamcrest.txt` für den vollständigen Lizenztext.