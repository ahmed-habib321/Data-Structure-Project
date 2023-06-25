package hotel.Person;

/**
 *
 * @author Ahmed
 */
/**
 * The Person class represents a person with basic information such as name, ID,
 * age, phone number, and email.
 */
public abstract class Person {

    private String name;
    private int id;
    private int age;
    private String phoneNumber;
    private String email;

    /**
     * Default constructor for the Person class.
     */
    public Person() {
    }

    /**
     * Constructs a Person object with the provided information.
     *
     * @param name the name of the person
     * @param id the ID of the person
     * @param age the age of the person
     * @param phoneNumber the phone number of the person
     * @param email the email address of the person
     */
    public Person(String name, int id, int age, String phoneNumber, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the ID of the person.
     *
     * @return the ID of the person
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the person.
     *
     * @param id the ID of the person
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retrieves the phone number of the person.
     *
     * @return the phone number of the person
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the person.
     *
     * @param phoneNumber the phone number of the person
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the email address of the person.
     *
     * @return the email address of the person
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the person.
     *
     * @param email the email address of the person
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the Person object.
     *
     * @return a string representation of the Person object
     */
    @Override
    public String toString() {
        return "Name: " + name
                + ", ID: " + id
                + ", Age: " + age
                + ", Phone Number: " + phoneNumber
                + ", Email: " + email;
    }

}
