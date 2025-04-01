
package javaapplication1;

import javaapplication1.sample.Developer;
import javaapplication1.sample.HR;
import javaapplication1.sample.Intern;
import javaapplication1.sample.Manager;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        
       Manager mg = new Manager(8, "Priya", 8000, "Operations", 10);
       Developer dev = new Developer("Java","Shyam", 60000, "Software", 5);
       Intern intern = new Intern("SGGS", "Yash", 20000, "Software", 1);
       HR hr = new HR(10,"Sahil", 70000, "Human Resources", 8);
       System.out.println(dev);
       System.out.println(mg);
       System.out.println(hr);
       System.out.println(intern);
       
        
        
    }
    
}
