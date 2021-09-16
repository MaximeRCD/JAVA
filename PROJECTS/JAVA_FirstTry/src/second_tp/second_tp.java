package second_tp;

import java.sql.Array;
import java.util.Arrays;


public class second_tp {
    public static void reorder1(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b);
    }

    public static void reorder2(int a, int b, int c) {
        int tmp = 0;
        boolean test2 = a < c;
        if (test2) {
            tmp = a;
            a = c;
            c = tmp;
        }
        boolean test3 = b < c;
        if (test3) {
            tmp = b;
            b = c;
            c = tmp;
        }
        boolean test1 = a < b;
        if (test1) {
            tmp = a;
            a = b;
            b = tmp;
        }


        System.out.println(a + " " + b + " " + c);
    }

    public static void exercice3(int i) {
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                if (i <= 0) {
                    System.out.println("Minimum value is 1");
                } else {
                    System.out.println("Maximum value is 7");
                }

        }
    }

    public static int abs(int c) {
        if (c < 0) {
            return -c;
        } else {
            return c;
        }
    }

    public static int signSum(int a, int b) {

        if (abs(a) > abs(b) && a < 0) {
            return -1;
        }
        if (abs(a) > abs(b) && a > 0) {
            return 1;
        }
        if (abs(a) < abs(b) && b < 0) {
            return -1;
        }
        if (abs(a) < abs(b) && b > 0) {
            return 1;
        }
        return 0;
    }

    public static void exe4() {
        int n = 5;
        int v = 1;
        int i = 0;
        while (i < n) {
            System.out.println(v);
            i = i + 1;
            v = 2 * v;
        }
    }

    public static void test1() {
        for (int i = 0; i < 10; i++) {
            i *= 5;
            System.out.println(i);
        }
    }

    public static void test2(int n) {
        for (int i = 1; i < n; i *= 4) {
            System.out.println("loop#1");
            for (int j = 1; j < i; j += 4) {
                System.out.println("loop#2");
            }
        }
    }

    public static void primeNumbers(int max) {
        for (int i = 2; i <= max; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    System.out.println(i);
                }
                if (i % j != 0) {
                    continue;//ici inutil
                } else {
                    break;
                }

            }
        }
    }

    public static void test3() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count++;
            for (int j = 0; j < 3; j++) {
                count++;
                //continue; ici inutile
                //break ;
            }
        }
        System.out.println(count);
    }

    public static void min_max ( int arr []) {
         int min ;
         int max ;
         Arrays.sort(arr);
         max = arr[0];
         min = arr[0];

         for (int i=1; i<arr.length;i++){
             if(min >= arr[i]){
                 min = arr[i];
             }
             if(max<=arr[i]){
                 max = arr[i];
             }
         }


         System . out . println (" Minimum value in the array = " + min );
         System . out . println (" Maximum value in the array = " + max );
    }

    public static void main(String[] args) {
        //System.out.println(signSum(55,-33));
        //System.out.println(signSum(-55,33));
        //System.out.println(signSum(-55,-33));
        //System.out.println(signSum(55,33));
        //System.out.println(signSum(-33,33));
        //exe4(); // print the nth first powers of 2
        //test1();
        //test2(17);
        //primeNumbers(15);
        //test3();
        //exercice3(6);
        //reorder2(55, 33, 98);
        //reorder2(-34, 33, 98);
        int arr [] = {11 ,15 ,6 ,7 ,88 ,9 ,22 ,3 ,48};
        min_max ( arr );

    }
}
