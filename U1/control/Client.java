package U1.control;

import U1.create.TranslatorFactory;
import U1.view.Translator;

public class Client {

    /**
     * Methode zur Ausgabe einer Zahl auf der Console
     * (auch bezeichnet als CLI, Terminal)
     *
     */
    void display( int aNumber ){

        Translator translator = TranslatorFactory.createTranslator();
        String result = translator.translateNumber(aNumber);


        System.out.println("Das Ergebnis der Berechnung: " + result );

    }
}
