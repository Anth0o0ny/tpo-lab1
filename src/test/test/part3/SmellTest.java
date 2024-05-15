package part3;

import org.junit.jupiter.api.Test;
import part3.enums.Smell;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmellTest {

    @Test
    public void testSmellTitles() {
        assertEquals("тление", Smell.SMOLDER.toString()); // Проверка строкового представления для SMOLDER
        assertEquals("гарь", Smell.SOOT.toString()); // Проверка строкового представления для SOOT
    }
}
