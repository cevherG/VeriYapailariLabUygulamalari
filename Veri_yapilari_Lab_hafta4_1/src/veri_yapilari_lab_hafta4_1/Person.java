package veri_yapilari_lab_hafta4_1;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public void displayPerson() {
        System.out.print("Last name: " + this.lastName);
        System.out.print(" First name: " + this.firstName);
        System.out.println(" Age: " + this.age);
    }

    public String getLastname()
    {
        return lastName;
    }

}
