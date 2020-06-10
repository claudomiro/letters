package org.claudomiro.interview.ibm.letters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Letter letter = new Letter();
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isReader);
        String str;
        while((str = reader.readLine())!= null){
            System.out.println(letter.shortestSubstring(str));;
        }
    }
}
