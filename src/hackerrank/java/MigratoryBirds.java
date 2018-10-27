package hackerrank.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MigratoryBirds {


    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 4, 5, 1, 4, 3, 2, 1, 3};

        migratoryBirds(arr);
    }

    private static void migratoryBirds(int[] arr) {
        int result[] = new int[5];

        for (int i : arr) {
            result[i - 1]++;
        }
        System.out.println(Arrays.stream(result).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(result).max().getAsInt()) + 1);
    }
}
