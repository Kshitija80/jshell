
package javaapplication1.sample;

import javaapplication1.Employee;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int teamSize, String name, int salary, String department, int experience) {
        super(name, salary, department, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" + "teamSize=" + teamSize + '}';
    }
    
}