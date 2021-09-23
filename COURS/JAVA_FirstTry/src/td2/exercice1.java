package td2;

public class exercice1 {
    public static void main(String[] args) {
        Person p1 = new Person("Holmes","Sherlock");
        Person p2 = new Person("Moriarty", "James");
        System.out.println("Your name is : " + p1.getLastName() +" and your firstname is : " + p1.getFirstName());
        System.out.println("Your name is : " + p2.getLastName() +" and your firstname is : " + p2.getFirstName());
    }
}
