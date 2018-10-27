package hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class AlternatingCharacters {

    public static void main(String[] args) {

        System.out.println(alternatingCharacters("ABABAABBA"));

    }
    static int alternatingCharacters(String s) {

        int total = 0;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                total++;
            }
        }

        return total;
    }
}
