package td2;

public class Person {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(){
        this.firstName = "to be set ";
        this.lastName = "to be set";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
