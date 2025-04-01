
package javaapplication1.sample;

import javaapplication1.Employee;


public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String programmingLanguage, String name, int salary, String department, int experience) {
        super(name, salary, department, experience);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" + "programmingLanguage=" + programmingLanguage + '}';
    }
    
}
