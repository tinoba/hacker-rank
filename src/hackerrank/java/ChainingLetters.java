package hackerrank.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChainingLetters {

    public static void main(String[] args) {
        String[] arr = {"A>I", "S>P", "P>A", "I>N"};
        System.out.println(chainingLetters(arr));
    }

    private static String chainingLetters(String[] array) {

        Map<String, String> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= array.length; i++) {
            String[] pair = array[i].split(">");
            String first = pair[0];
            String second = pair[1];

            if (set.contains(first)) {
                set.remove(first);

            } else {
                set.add(first);

            }
            if (set.contains(second)) {
                set.remove(second);

            } else {

                set.add(second);
            }
            map.put(first, second);
        }
        String firstPosition = "";
        for (int i = 0; i < array.length; i++) {
            String[] pair = array[i].split(">");
            String first = pair[0];

            if (set.contains(first)) {
                firstPosition = first;
                break;
            }
        }

        String result = firstPosition;

        for (int i = 0; i < array.length; i++) {
            String novi = map.get(firstPosition);
            result += novi;
            firstPosition = novi;
        }

        return result;
    }
}
