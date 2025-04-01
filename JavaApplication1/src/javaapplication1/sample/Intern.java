
package javaapplication1.sample;

import javaapplication1.Employee;


public class Intern extends Employee {
    private String collegeName;

    public Intern(String collegeName, String name, int  salary, String department, int experience) {
        super(name, salary, department, experience);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Intern{" + "collegeName=" + collegeName + '}';
    }
    

}