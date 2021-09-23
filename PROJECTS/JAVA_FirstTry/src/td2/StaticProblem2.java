package td2;

public class StaticProblem2 {

    static int myStaticAttribute = 0;
    int myNonStaticAttribute = 0;
// Leaving default automatic empty constructor
    /** Increases both myStaticAttribute and myStaticAttribute
     * by one.
     */
    void increment(){
        myStaticAttribute++;
        myNonStaticAttribute++;
    }
    /** This is the entry point */
    public static void main(String[] args) {
        StaticProblem2 stp1 = new StaticProblem2();
        stp1.increment();
        System.out.println("stp1.myStaticAttr="+stp1.myStaticAttribute);
        System.out.println("stp1.myNonStaticAttr="+stp1.myNonStaticAttribute);
        StaticProblem2 stp2 = new StaticProblem2();
        stp2.increment();
        System.out.println("stp2.myStaticAttr="+stp2.myStaticAttribute);
        System.out.println("stp2.myNonStaticAttr="+stp2.myNonStaticAttribute);
    }
}
