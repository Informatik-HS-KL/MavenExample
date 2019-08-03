# MavenExample
Dieses GitHub-Repo ist eine Kopie des im Skript "Build-Verfahren" beschriebenen einfachen Maven-Projekts, das mit dem Archetype quickstart
in einem leeren Verzeichnis erstellt wird. 
Dieses Beispiel verwenden wir als Demonstrationsobjekt für die Einführung in Maven und als Beispiel eines Jenkins-Projekts, das mit GitHub als SCM verbunden ist. 

Das repo enthält 4 Branches:
- master
- develop
- externals: Verwendung von externen Bibliotheken am Beispiel log4j2.
- documentations: Dokumentation mit Javadoc und Doxygen.

Das repo enthält mehrere Releases als Musterlösung von Aufgaben:
- Vbasic1920: Anlegen eines neuen Maven-Projekts vom Archetyp "quickstart" und Verändern der Anwendung App.java
- Vjar1920: Anlegen eines jar-Files mit Manifest, das direkt mit java -jar ausgeführt werden kann.
- Vexec1920: Ausführen einer Anwendung mit mvn exec:java und neue Anwendung TimeStamp, die aufgerufen wird.
- VexecIds1920: Ausführen mehrerer Anwendungen mit mvn exec:java@id.
- Vexternals1920: Aufnehmen von externen Bibliotheken in ein Maven-Projekt am Beispiel log4j2 und erzeugen eines ausführbaren jar-Files, der die Externals enthält, so dass direkt java -jar verwendet werden kann mit dem 
assembly-Plugin.
- Vjd1920: Dokumentation mit Javadoc.
- Vdoxy1920: Dokumentation mit Doxygen und einer Konfiguration in Doxyfile. 
