public class Practical8 {

static void printR(int ln, int star) {
        if (star > ln) {
            return; 
        }
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
        printR(ln, star + 1);
    }
     static void printRDown(int ln, int star) {
        if (star < 1) {
            return;
        }
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
        printRDown(ln, star - 1);
    }
    static void printPyramid(int ln) {
        printR(ln, 1);  
        printRDown(ln + 1, ln + 1);
    } 
   
 

public static void display(int ln, int size) {
        if (ln == 1) {
            for (int i = 1; i <= (size - ln) / 2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= ln; i++) {
                System.out.print("*");
            }
            System.out.println();

            display(ln + 2, size);

            for (int i = 1; i <= (size - ln) / 2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= ln; i++) {
                System.out.print("*");
            }
            System.out.println();
           for(int j = 1 ; j <= size ; j++){
                for (int i = 1; i <= (size - ln) / 2; i++) {
                System.out.print(" ");}
                for (int i = 1; i <= ln; i++) {
                System.out.print("+");
            }
            System.out.println();
            
            }
        } else if (ln == size) {
            for (int i = 1; i <= ln; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= (size - ln) / 2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= ln; i++) {
                System.out.print("*");
            }
            System.out.println();

            display(ln + 2, size);

            for (int i = 1; i <= (size - ln) / 2; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= ln; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
        
  static  void display1(int ln,int size)
   {
       if(ln<=size+1)
       {
        printspace1(ln,1,size);
        printstar1(ln,1,size);
        System.out.println();
        display1(ln+1,size);
        if(ln<=size)
        {
        printspace1(ln,1,size);
        printslash1(ln,1);
        System.out.println();
      }
  }
  }

static void printstar1(int ln,int p,int size)
{
   if(p<=ln){
     if(ln<=size){
      System.out.print("*");
     }
    else if(ln==size+1){
       System.out.print("+");
    }
   printstar1(ln,p+1,size);
    }
}
  static void printspace1(int ln,int space,int size)
  {
      if(space<=size+1-ln){
         System.out.print(" ");
        printspace1(ln,space+1,size);
      }
    }
   static void printslash1(int ln,int slash)
  {
    if(slash<=ln){
   System.out.print("/");
  printslash1(ln,slash+1);
      }
  } 
   public static void main(String[] args){
        Practical8 a1=new Practical8();
        a1.printPyramid(3);
        a1.display(1,5);
        a1.display1(1,3);
        }
      }
  


