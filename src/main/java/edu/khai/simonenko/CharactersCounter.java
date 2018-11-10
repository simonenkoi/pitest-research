package edu.khai.simonenko;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCounter {

    public Map<Character, Long> count(CharSequence charSequence) {
        return charSequence.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
