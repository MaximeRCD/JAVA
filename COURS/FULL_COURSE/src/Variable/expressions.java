package Variable;

public class expressions {
    public static void main(String[] args) {
        // the division by an int truncates the result as an int, so it's possible to cast result
        int n = 10;
        int d = 3;
        System.out.println(n / d); // 3
        System.out.println((double)n / d);// 3.3333333333333335

    }
}
