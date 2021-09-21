package Variable;

import java.util.Scanner;

public class math_class {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        // get max (x,y)
        double M = Math.max(x,y);
        // get min (x,y)
        double m = Math.min(x,y);
        // get abs (x,y)
        double a = Math.abs(y);
        // get sqrt (x,y)
        double s = Math.sqrt(x);
        // get ceil (x,y)
        double c = Math.ceil(y);
        // get floor (x,y)
        double f = Math.floor(y);

        System.out.println(x);
        System.out.println(y);
        System.out.println(M);
        System.out.println(m);
        System.out.println(a);
        System.out.println(s);
        System.out.println(c);
        System.out.println(f);

        // calculate the hypothenus of a triangle

        double length1;
        double length2;
        double hyp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is length 1 ?");
        length1=scanner.nextDouble();

        System.out.println("What is length 2 ?");
        length2=scanner.nextDouble();

        hyp = Math.sqrt((length1*length1)+(length2*length2));

        System.out.println("The length of the hypotenuse is " + hyp);

        scanner.close();





    }
}
