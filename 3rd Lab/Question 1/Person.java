import java.util.Scanner;

/**
 * <p><b>Person Class</b></p>
 * This class represents a person with a name, age, and address.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Person{
    private String name;
    private int age;
    private String address;

    /**
     * Constructor to initialize a Person object.
     * 
     * @param name The name of the person.
     * @param age The age of the person.
     * @param address The address of the person.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Gets the name of the person.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     * 
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     * 
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the address of the person.
     * 
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the person.
     * 
     * @param address The new address of the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Displays the person's details.
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
 