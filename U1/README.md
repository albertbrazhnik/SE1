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
   Die Trennung erhöht die Übersicht über das gesamte Projekt. Außerdem kann man dadurch Veränderungen an den anderen Klassen vornehmen, ohne die Testklasse öndern zu müssen.
   Ein Blackbox Testing ist dadurch auch möglich, da man ohne Zugriff auf den inneren Code testen kann.
   
6) Was ist bei einem Blackbox-Test der Sinn von Äquivalenzklassen?

   Antwort:
   Der Sinn von Äquivalenzklassen im Blackbox-Testverfahren ist, die Anzahl der notwendigen Testfälle zu reduzieren, ohne die Abdeckung zu gefährden.
   Bei der Äquivalenzklassenbildung wird der Eingabebereich in Klassen unterteilt, die ähnliche Verhaltensweisen des Systems erwarten lassen.
   Für jede Äquivalenzklasse wird ein Repräsentant ausgewählt, der stellvertretend für alle Werte in dieser Klasse getestet wird.
   Somit lassen sich die Testfälle minimieren.

8) Warum ist ein Blackbox-Test mit JUnit auf der Klasse Client nicht unmittelbar durchführbar?

   Antwort:
   Ein Blackbox-Test auf der Klasse Client ist deshalb nicht unmittelbar durchführbar, weil Client keinen direkten Code für die Übersetzung enthält.
   Die Class verwendet das Translator-Interface, welches durch eine konkrete Implementierung (z.B. GermanTranslator) ersetzt wird.
   In einem Blackbox-Test wird normalerweise das Verhalten des Systems getestet, ohne den inneren Code zu kennen.
   In diesem Fall wird Client aber von Translator-Objekten beeinflusst, was den Test erschwert.

   
