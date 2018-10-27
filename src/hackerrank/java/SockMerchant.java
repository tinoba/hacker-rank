package hackerrank.java;

import java.util.Arrays;

public class SockMerchant {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(arr.length, arr));
    }

    private static int sockMerchant(int n, int[] ar) {
        int result[] = new int[Arrays.stream(ar).max().getAsInt()];

        for (int i : ar) {
            result[i - 1]++;
        }

        int total = 0;

        for (int i : result) {
            if (i > 1) {
                total += i / 2;
            }
        }
        return total;
    }
}
