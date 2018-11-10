package edu.khai.simonenko;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharactersCounterTest {

    @Test
    void testThatStringWillCountCharactersProperly() {
        CharactersCounter charactersCounter = new CharactersCounter();
        Map<Character, Long> absCount = charactersCounter.count("abc");
        assertEquals(absCount.get('a'), Long.valueOf(1));
        assertEquals(absCount.get('b'), Long.valueOf(1));
        assertEquals(absCount.get('c'), Long.valueOf(1));
    }
}