
package javaapplication1.sample;

import javaapplication1.Employee;


public class HR extends Employee {
    private int hiringQuota;

    public HR(int hiringQuota, String name, int salary, String department, int experience) {
        super(name, salary, department, experience);
        this.hiringQuota = hiringQuota;
    }

    public int getHiringQuota() {
        return hiringQuota;
    }

    public void setHiringQuota(int hiringQuota) {
        this.hiringQuota = hiringQuota;
    }

    @Override
    public String toString() {
        return "HR{" + "hiringQuota=" + hiringQuota + '}';
    }
    
    
    
}
