package U1.test;


import U1.create.TranslatorFactory;
import U1.view.GermanTranslator;
import U1.view.Translator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GermanTranslatorTest {

    @Test
    public void aTest() {
        GermanTranslator translator = new GermanTranslator();

        assertNotEquals("null" , translator.translateNumber(0));
    }

    @Test
    public void Test1() {
        Translator translator = TranslatorFactory.createTranslator();
        assertEquals("eins", translator.translateNumber(1));
        assertEquals("zehn", translator.translateNumber(10));
    }

    @Test
    public void Test2() {
        Translator translator = TranslatorFactory.createTranslator();
        assertEquals("Übersetzung der Zahl 11 nicht möglich (v1.0)",
                translator.translateNumber(11));
        assertEquals("Übersetzung der Zahl 0 nicht möglich (v1.0)",
                translator.translateNumber(0));
    }

}