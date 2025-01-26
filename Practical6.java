
public class Practical6 {

void displayPattern1 (int size) {
       
        for (int ln = 1; ln <= size; ln++) {
           for (int space = 0; space < size - ln; space++) {
                System.out.print(" ");
                }
                for (int space = 1; space <= ln; space++) {
                System.out.print("+");
                    if (space < ln) {
                    System.out.print(" ");
                    } 
                    }
            System.out.println();
        }
        
        for (int ln = size - 1; ln >= 1; ln--) {
         for (int space = 0; space < size - ln; space++) {
                System.out.print(" ");
            }
          for (int space = 1; space <= ln; space++) {
                System.out.print("*");
                if (space < ln) {
                    System.out.print(" ");
                    }
                  }
                 System.out.println();
                 }
                 }
                

  void displayPattern2(int size) {
        int totalSymbols;

        for (int ln = 0; ln < size; ln++) {
            totalSymbols = 2 * ln + 1; 
       for (int space = 0; space < size - ln - 1; space++) {
                System.out.print(" ");
            }
            for (int space = 0; space < totalSymbols; space++) {
                System.out.print("+");
            }
            System.out.println();
        }
       for (int ln = size - 2; ln >= 0; ln--) {
            totalSymbols = 2 * ln + 1; 
      for (int space = 0; space < size - ln - 1; space++) {
                System.out.print(" ");
        }
       for (int space = 0; space < totalSymbols; space++) {
                System.out.print("+");
            }
              System.out.println();
        }
  }
   
void displayPattern3(int size){
    for(int ln = 1 ; ln <= size ; ln++){
    for(int spaces =size - ln; spaces >0; spaces --){
 	  System.out.print(" ");
 	  }
 	  for(int pattern = (2 * ln)-1 ; pattern>0 ; pattern --){
 	  if( (pattern + ln) % 2 == 1){
 	 	System.out.print("+");
 	 	}
 	 	else{
 	 	System.out.print("*"); 
 	 	}
 	 	}
 	 	System.out.print("\n");
    }
   for(int ln =size ; ln >0 ; ln--){
   for(int spaces =size - ln; spaces >0; spaces --){
 	  System.out.print(" ");
 	  }
 	  for(int pattern= (2 * ln)-1 ; pattern >0 ; pattern --){
 	  if((pattern + ln) % 2 == 1){
 	 	System.out.print("*");
 	 	}
 	 	else{
 	 	 	System.out.print("+"); 
 	 	 	}
 	 	 	}
 	 	System.out.print("\n");
   }
  }
  public static void main(String[] args) {
        Practical6 pattern = new Practical6();
        pattern.displayPattern1(3);
         pattern.displayPattern2(3);
          pattern.displayPattern3(3);
  }
  }
  
   




