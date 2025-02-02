public class Practical7Vertical{

void displayK(int size){
size+=1;
for(int row=1; row<2*size; row++){
   System.out.print("*");
        if (row<=size) {
            for (int space=1; space<=size-row; space++) {
                 System.out.print(" ");
            }
            System.out.print("*"); 
            for (int space=1; space<=row-1; space++) {
                System.out.print(" ");
            }
        } else {
            for (int space=1; space<=row-size; space++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int space=1; space<=2*size-row-1; space++) {
               System.out.print(" ");
            }
        }
       System.out.println();
    }
   }
 void displayS(int size){
 size+=1;
     for(int row=1; row<2*size; row++){
  
        for (int col=1; col<2*size; col++) {
            if ((row==1)||(row==2*size-1)||(row==size)||(col==1 && row<size)||(col==2*size-1 && row>size)) {
                if ((row==1 && col==1)||(row==size && col==2*size-1)||(row==size && col==1)||(row==2*size-1 && col==2*size-1)) {
                    System.out.print(" ");
                } else {
                   System.out.print("*");
                }
            } else {
                System.out.print(" ");
            }
        }
       System.out.println(); 
    }
 }
  void displayH(int size){
    size+=1;
    for(int row=1; row<2*size; row++){
     for (int col=1; col<2*size; col++) {
            if (col==1 || col==2*size-1 || row==size) {
               System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
       System.out.println();
    }
  }
void displayI(int size){
  size+=1;
    for (int row=1; row<2*size; row++){
      for (int col=1; col<2*size; col++) {
            if (row==1 || row==2*size-1 || col==size) {
              System.out.print("*");
            } else {
               System.out.print(" ");
            }
        }
        System.out.println();
      }

  }
  
     
   void displayT(int size){
   size+=1;
   for(int row=1; row<2*size; row++){
      for (int col=1; col<2*size; col++) {
            if (row==1 || col==size) {
                System.out.print("*");
            } else {
                  System.out.print(" ");
            }
        }
     System.out.println();
    }
     
      }
      
  void displayJ(int size){
  size+=1;
  for(int row=1; row<2*size; row++){
  
  for (int col=1; col<2*size; col++) {
            if ((row==1 || col==size )||(row>size && col==1)||(col<=size && row==2*size-1)){
                if (row==2*size-1 && col==1) {
                    System.out.print(" ");
                } else {
                 System.out.print("*");
                }
            } else {
               System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    
    void displayA(int size){
    size+=1;
    for(int row=1; row<2*size; row++){
   
     for (int col=1; col<2*size; col++) {
            if(col==size-row+1 || col==size+row-1 || row==size ||(row>size && row<=2*size-1 && col==1)||(row>size && row<= 2*size-1 && col==2*size-1)) {
               System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
     
    public static void main( String [] args){
   Practical7Vertical abc = new Practical7Vertical();
      
        abc.displayK(1);
      System.out.println();
        abc.displayS(1);
      System.out.println();
        abc.displayH(1);
      System.out.println();
         abc.displayI(1);
      System.out.println();
         abc.displayT(1);
      System.out.println();
        abc.displayI(1); 
      System.out.println();
          abc.displayJ(1);
      System.out.println();
        abc.displayA(1);
      System.out.println();
    }
    }

    


