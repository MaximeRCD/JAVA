package static_statement;

public class Boolean_stat {
    static boolean b1;
    static boolean b2;
    static boolean b3;

    static boolean test(boolean b,boolean c, boolean d){
        return (b&c)||(c&d)||(b&d);
    }

    public static void main(String[] args) {
        System . out . println ( test (true , true , false ) );
        System . out . println ( test (true , false , true ) );
        System . out . println ( test (true , false , false ) ) ;
        System . out . println ( test (false , false , true ) ) ;
    }
}
