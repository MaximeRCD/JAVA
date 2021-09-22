package Oop;

public class main {
    public static void main(String[] args) {
        //Object first_object = new Object("This is an object");
        //first_object.setA_property("Ohh in fact that's a book");
        //System.out.println(first_object.getA_property());

        //Car renault = new Car(1000);
        //renault.start();
        //renault.accelerate(10,4.3);
        //System.out.println(renault.getSpeed());

        Account account = new Account(1000.15,123527281L, Account.TypeAccount.Saving);
        System.out.println(account.getBalance());
        account.credit(100);
        account.withdraw(12000);
        account.Display();
    }
}
