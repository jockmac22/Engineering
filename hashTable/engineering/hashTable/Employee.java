package engineering.hashTable;

/**
 * A basic class for use with the hash tables.
 */
public class Employee {
    public String id;
    public String first_name;
    public String last_name;
    public Double salary;
    
    public Employee(String id, String first_name, String last_name, Double salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }
}
