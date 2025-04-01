
package javaapplication1;


public class Employee {
    private String name;
    private int salary;
    private String department; 
    private int experience;

    public Employee(String name, int salary, String department, int experience) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", department=" + department + ", experience=" + experience + '}';
    }
    
  
    
}    

  
       
   
