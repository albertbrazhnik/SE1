package U1.create;

import U1.view.GermanTranslator;
import U1.view.Translator;

public class TranslatorFactory {
    public static Translator createTranslator() {
        // GermanTranslator-Objekt erstellen
        GermanTranslator translator = new GermanTranslator();

        //  Erstellungsdatum setzen
        translator.setDate("Okt/2024");
        return translator;
    }
}
