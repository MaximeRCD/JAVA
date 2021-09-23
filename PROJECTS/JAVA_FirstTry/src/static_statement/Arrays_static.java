package static_statement;

public class Arrays_static {

    static boolean method2(int[] t1, int[] t2){
        if (t1.length != t2.length){
            return false;
        }else {
            for (int i = 0; i < t1.length; i++) {
                if (t1[i] != t2[i]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int [] a = { 1, 11 , 7, 31 , 5 };
        int [] b = { 1, 11 , 7, 31 };
        int [] c = { 1, 11 , 7, 31 , 5 };
        int [] d = { 5, 11 , 7, 31 , 5 };
        System . out . println ( method2 (a , a));
        System . out . println ( method2 (a , b));
        System . out . println ( method2 (a , c));
        System . out . println ( method2 (a , d));
    }
}
