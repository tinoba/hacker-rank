package hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

    /**
     * Default test case
     */
    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>() {{
            add(3);
            add(10);
            add(2);
            add(9);
        }};

        bonAppetit(bill, 1, 12);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int sum = bill.stream().mapToInt(Integer::intValue).sum();

        int paid = (sum - bill.get(k)) / 2;
        if (paid == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - paid);
        }
    }
}
