package hackerrank.java;

public class MakeAnagram {

    public static void main(String[] args) {

        System.out.println(makeAnagram("cde", "abc"));
    }


    static int makeAnagram(String a, String b) {

        int[] chars= new int[(int)'z' +1];

        a.chars().forEach(it -> chars[(int)it]++);
        b.chars().forEach(it -> chars[(int)it]--);

        int total = 0;
        for (int aChar : chars) {
            if (aChar != 0){
                total += Math.abs(aChar);
            }
        }
        return total;
    }
}
