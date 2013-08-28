package engineering.hashTable;

import java.util.HashMap;

public class HashTableDemonstration {
    public static void main(String[] args) {
        HashMap<String, Employee> employees = new HashMap<String, Employee>();
        
        Employee employee = new Employee("00001", "Jim", "Jones", 100000.00);
        employees.put(employee.id, employee);
        
        employee = new Employee("00002", "Jane", "Doe", 120000.00);
        employees.put(employee.id, employee);

        employee = new Employee("00003", "Mitchell", "Lewis", 115000.00);
        employees.put(employee.id, employee);

        employee = new Employee("00004", "Jillian", "Andersen", 2000000.00);
        employees.put(employee.id, employee);

        HashTableDemonstration.outputEmployee(employees, "00003");
        HashTableDemonstration.outputEmployee(employees, "00001");
        HashTableDemonstration.outputEmployee(employees, "00004");
        HashTableDemonstration.outputEmployee(employees, "00002");
        HashTableDemonstration.outputEmployee(employees, "00006");
    }
    
    public static void outputEmployee(HashMap<String, Employee> employees, String id) {
        System.out.println("Employee ID: " + id);
        
        Employee employee = employees.get(id);
        
        if (employee != null) {
            System.out.println("-- First Name : " + employee.first_name);
            System.out.println("-- Last Name  : " + employee.last_name);
            System.out.println("-- Salary     : " + employee.salary.toString());
        } else {
            System.out.println("-- Employee ID does not exist.");
        }
        System.out.println("");
    }
}
