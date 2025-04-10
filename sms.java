
class person{
  public String name ;
  public int age ;
  public String dob ;
  public String blood_group;
  person(String name , int age ,String dob , String blood_group){
      this.name = name ;
      this.age = age ;
      this.dob = dob;
      this.blood_group = blood_group;
    }
      
}
class student extends person{
    static int student_count ;
    static String[] branch_list ;
    static int [] branch_count ;
    int roll_no ;
    String reg_no ;
    int admission_year ;
    String branch ;
   String student_type;
    static {
      String [] str = {"CSE","IT","EXTC","MECH","ELE"};
       branch_list = str ;
        branch_count  = new int[5];
    }
    static int get_index(String str){
       str = str.toUpperCase();
       if(str.equals("CSE")){
         return 0;
       }
       if(str.equals("IT")){
         return 1;
       }
        if(str.equals("EXTC")){
          return 2;
        }
        if(str.equals("MECH")){
          return 3;
        }
        if(str.equals("ELE")){
          return 4;
        }
        else {
          return -1 ;
        } 
      }
    student(String name , int age ,String dob , String blood_group , String branch , String student_type, int admission_year){
        super(name,age,dob,blood_group);
        student_count++;
        this.branch = branch ;
         this.student_type = student_type;
        this.admission_year = admission_year;
        roll_no = ++branch_count[get_index(branch)];
        
        if(student_type.equals("Regular")){
            String s = roll_no+"";
            reg_no = admission_year+"B"+ branch+"0".repeat(3-s.length())+roll_no;
            }
        else {
          String s =student_count + "";
          reg_no = admission_year+"B"+branch+"0".repeat(3-s.length())+student_count;
        }        
        
    }

public String toString() {
        return "BTech Student Details:\n" +
               "Name: " + this.name + "\n" +
               "Age: " + this.age + "\n" +
               "Blood Group: " + this.blood_group + "\n" +
               "Branch: " + this.branch + "\n" +
               "Regular: " + this.student_type + "\n" +
               "Admission Year: " + this.admission_year + "\n" +
               "Roll No: " + this.roll_no + "\n" +
               "Registration No: " + this.reg_no;
         }
    }

class sms{
    public static void main(String [] args){
       student[] s = new student[args.length];
       int i = 0 ;
       for(String str : args){
        String [] string = str.split(",");
         s[i] = new student(string[0],Integer.parseInt(string[1]),string[2],string[3],string[4],string[5],Integer.parseInt(string[6]));
         i++;
       }
       for (student st : s) {
            System.out.println(st);
            System.out.println("------------------");
      }
   }
} 
