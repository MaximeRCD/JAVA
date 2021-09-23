package td2;

public class StaticProblem {
    static int myAttribute = 0;
    /** This is the entry point */
    public static void main(String[] args) {
        System.out.println("myAttribute="+myAttribute);
    }
}

// Question 1 :
// myAttribute is not static so main can't use it

// Question 2 :
// java: non-static variable myAttribute cannot be referenced from a static context

// Question 3 :
// myAttribute=0