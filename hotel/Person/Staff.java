package hotel.Person;

/**
 *
 * @author Ahmed
 */
/**
 * The Staff class represents a staff member.
 */
public class Staff extends Person {

    private int salary;
    private int bonus;
    private String ssn;

    /**
     * Default constructor for the Staff class.
     */
    public Staff() {
    }

    /**
     * Constructs a Staff object with the provided information.
     *
     * @param salary the salary of the staff member
     * @param bonus the bonus of the staff member
     * @param ssn the SSN (Social Security Number) of the staff member
     * @param name the name of the staff member
     * @param id the ID of the staff member
     * @param age the age of the staff member
     * @param phoneNumber the phone number of the staff member
     * @param email the email address of the staff member
     */
    public Staff(int salary, int bonus, String ssn, String name, int id, int age, String phoneNumber, String email) {
        super(name, id, age, phoneNumber, email);
        this.salary = salary;
        this.bonus = bonus;
        this.ssn = ssn;
    }

    /**
     * Retrieves the SSN (Social Security Number) of the staff member.
     *
     * @return the SSN of the staff member
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the SSN (Social Security Number) of the staff member.
     *
     * @param ssn the SSN of the staff member
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * Retrieves the salary of the staff member.
     *
     * @return the salary of the staff member
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the staff member.
     *
     * @param salary the salary of the staff member
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Retrieves the bonus of the staff member.
     *
     * @return the bonus of the staff member
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * Sets the bonus of the staff member.
     *
     * @param bonus the bonus of the staff member
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * Returns a string representation of the Staff object.
     *
     * @return a string representation of the Staff object
     */
    @Override
    public String toString() {
        return "Staff { " + super.toString() + ", salary = " + salary + ", bonus = " + bonus + ", SSN = " + ssn + " }";
    }

}
