package td2;

public class exe1dA {
    int a;
    int b;

    /** Quick setter method */
    public void setParameters(int a, int b){
        this.a = a;
        this.b = b;
    }
    /** Instance method: Adds this.a and this.b */
    public int add(){
        return this.a + this.b;
    }

    /** Class method: Adds s1 and s2 */
    public static int returnSum(int s1, int s2){
        return (s1 + s2);
    }

    public static void main(String[] args) {
        exe1dA twoInt = new exe1dA();
        twoInt.setParameters(1,2);
        //Question 1:
        System.out.println(twoInt.add());
        //Question 2:
        System.out.println(exe1dA.returnSum(4,6));
    }
}

// Question 3:
// we can't use returnSum from an instance of class exe1dA because it's declared static and
// class variable are not static