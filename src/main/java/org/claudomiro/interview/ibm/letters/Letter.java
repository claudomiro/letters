package org.claudomiro.interview.ibm.letters;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Letter {

    private static final int ONE_THOUSAND = 1000;
    public static final int MAX_SIZE = 100 * ONE_THOUSAND;

    public int shortestSubstring(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Passed null to shortestSubstring");
        }
        if(s.length() > MAX_SIZE) {
            throw new IllegalArgumentException(String.format("Code prepared to run in Strings of length %d", MAX_SIZE));
        }
        int distinctLetters = distinctLetters(s);
        for(int window = distinctLetters; window <= s.length(); window++) {
            for(int j=0; j +window <= s.length(); j++ ) {
                if(distinctLetters(s.substring(j, j+window)) == distinctLetters) {
                    return window;
                }
            }
        }
        throw new RuntimeException("Alguma coisa muito errada acoteceu ... não era pra chegar aqui");
    }

    private int distinctLetters(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        return charSet.size();
    }


}
