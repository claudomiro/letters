package org.claudomiro.interview.ibm.letters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class LetterTests {
    private static final char [] subset = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final Random randomGenerator = new Random();

    private Letter letter;

    @BeforeEach
    void setUp() {
        letter = new Letter();
    }

    @Test
    public void whenValidGroupOfLettersGiveNumericAswer() {
//        assertThat(letter.shortestSubstring("bab"), equalTo(2));
        assertThat(letter.shortestSubstring("babc"), equalTo(3));
    }

    @Test
    public void whenRepetedLettersGiveCorrectAswer() {
        assertThat(letter.shortestSubstring("baacaab"), equalTo(4));
    }
/*

    @Test
    public void whenBiggestStringFunctionWorkds() {
        assertThat();
    }
*/

    @Test
    public void whenNullReturnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            letter.shortestSubstring(null);
        });
    }

    @Test
    public void whenBigStringReturnException() {
        System.out.println(Runtime.getRuntime().maxMemory());
        String bigString = generateRandomString(Letter.MAX_SIZE + 1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            letter.shortestSubstring(bigString);
        });
    }

    private String generateRandomString(int sizeOfFinalString) {
        char buf[] = new char[sizeOfFinalString];
        for (int i=0;i<buf.length;i++) {
            int index = randomGenerator.nextInt(subset.length);
            buf[i] = subset[index];
        }
        return new String(buf);
    }

}
