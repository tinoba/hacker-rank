package hackerrank.java;

public class Sherlock {

    public static void main(String[] args) {

        System.out.println(isValid("abcdefghhgfedecba"));

    }

    static String isValid(String s) {

        int[] ints = new int['z'];

        for (int i = 0; i < s.length(); i++) {
            ints[(int) s.charAt(i)]++;
        }

        int error = 0;

        for (int i = 0; i < s.length()-1; i++) {
            int num = ints[(int)s.charAt(i)];
            int num1 = ints[(int)s.charAt(i)+1];
            if (num == 0 || num1 == 0) continue;
            if (num != num1){
                error++;
            }
        }
        if (error<= 1){
            return "YES";
        }else{
            return "NO";
        }
    }
}
