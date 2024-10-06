1) Wie kann diese Kommunikationsverbindung nun dennoch mit Hilfe einer zusätzlichen „Fabrik“-Klasse, welche die dazu notwendige Objekt-Erzeugung übernimmt, aufgebaut werden? 
   In welchem Package sollte diese zusätzliche Klasse liegen? Bitte beachten Sie dabei auch die Hinweise bzw. Anforderungen aus den Kommentaren der Klassen, Methoden und des 
   Interfaces. So sollte z.B. auch das Datum der Erzeugung eines Translator-Objekts gesetzt werden.

   Antwort:
   Die Kommunikationsverbindung kann mit Hilfe des Factory Design Patterns implementiert werden. Dieses Muster wird verwendet, um die Erzeugung von Objekten zu kapseln.
   Eine separate Fabrik-Klasse (z.B. TranslatorFactory) übernimmt die Erstellung eines Objekts der Klasse GermanTranslator, das zur Laufzeit im Client verwendet wird.
   Die Fabrik-Klasse sollte in einem separaten Package untergebracht werden (z.B. create) um die Erzeugung sauber von der Kontrolle zu trennen.


2) Welches Entwurfsmuster (engl.: design pattern) könnte für die Problematik der Objekt-Erzeugung verwendet werden?
   Was ist der software-technische Nutzen bei der Verwendung des Entwurfsmusters?

   Antwort:
   Das geeignete Entwurfsmuster für die Objekt-Erzeugung ist das Factory Design Pattern. Dieses Pattern kapselt die Erzeugung von Objekten und trennt sie von deren Verwendung.
   Der Nutzen des Factory Patterns liegt vorallem in der Flexibilität, da man so die einzelnen Bereiche z.B. austauschen oder verändern kann, ohne dass die anderen Bereiche beeinflusst werden.


3) Wie muss man den Source Code des Interface ggf. anpassen, um mögliche auftretende Kompilierfehler zu beseitigen?

   Antwort:
   Das Interface muss die Sichtbarkeit public haben, da ansonsten die andreren Klassen nicht darauf zugreifen können


4) Was ist der Vorteil einer separaten Test-Klasse?

   Antwort:
   Die Trennung erhöht zum einen die Übersicht über das gesamte Projekt
   
6) Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?

   Antwort:


7) Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?

   Antwort: 
