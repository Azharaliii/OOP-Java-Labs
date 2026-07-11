/**
 * <b>Person Class</b>
 * <p>
 * This class represents a person with a name, age, and address.
 * </p>
 *
 * @author Your Name
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private String address;

    /**
     * <b>Constructor</b>: Initializes a new Person.
     *
     * @param name    The person's name.
     * @param age     The person's age.
     * @param address The person's address.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * <b>Gets the name</b>.
     *
     * @return The person's name.
     */
    public String getName() {
        return name;
    }

    /**
     * <b>Gets the age</b>.
     *
     * @return The person's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * <b>Gets the address</b>.
     *
     * @return The person's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * <b>Sets a new address</b>.
     *
     * @param address The new address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <b>Displays person details</b>.
     */
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }
}
