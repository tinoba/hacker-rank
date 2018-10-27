package hackerrank.java;

public class PageCount {

    public static void main(String[] args) {
        System.out.println(pageCount(4,4));
    }

    private static int pageCount(int n, int p){
        int left = p / 2;
        if(n%2==0){
            n++;
        }
        int right =(n-p) / 2;
        return left < right ? left : right;
    }
}
