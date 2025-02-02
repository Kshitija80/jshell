public class Practical7 {

    // For Letter K
    String displayK(int row, int size) {
        String pattern="";
        pattern +="*";
        if (row<=size) {
            for (int space=1; space<=size-row; space++) {
                pattern+=" ";
            }
            pattern+="*"; 
            for (int space=1; space<=row-1; space++) {
                pattern+=" ";
            }
        } else {
            for (int space=1; space<=row-size; space++) {
                pattern+=" ";
            }
             pattern+= "*";
            for (int space=1; space<=2*size-row-1; space++) {
                pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter S
    String displayS(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if ((row==1)||(row==2*size-1)||(row==size)||(col==1 && row<size)||(col==2*size-1 && row>size)) {
                if ((row==1 && col==1)||(row==size && col==2*size-1)||(row==size && col==1)||(row==2*size-1 && col==2*size-1)) {
                    pattern+=" ";
                } else {
                    pattern+="*";
                }
            } else {
               pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter H
    String displayH(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if (col==1 || col==2*size-1 || row==size) {
                pattern+="*";
            } else {
                pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter I
    String displayI(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if (row==1 || row==2*size-1 || col==size) {
               pattern+="*";
            } else {
                pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter T
    String displayT(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if (row==1 || col==size) {
                pattern+="*";
            } else {
                pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter J
    String displayJ(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if ((row==1 || col==size )||(row>size && col==1)||(col<=size && row==2*size-1)){
                if (row==2*size-1 && col==1) {
                    pattern+=" ";
                } else {
                    pattern+="*";
                }
            } else {
                pattern+=" ";
            }
        }
        return pattern;
    }

    // For Letter A
    String displayA(int row, int size) {
        String pattern="";
        for (int col=1; col<2*size; col++) {
            if(col==size-row+1 || col==size+row-1 || row==size ||(row>size && row<=2*size-1 && col==1)||(row>size && row<= 2*size-1 && col==2*size-1)) {
                pattern+="*";
            } else {
                pattern+=" ";
            }
        }
        return pattern;
    }

  
    public static void main(String[] args) {
       Practical7 obj = new Practical7();
        int size = 1; 
       size+=1;
        for (int row = 1; row < 2 * size; row++) {
            
            System.out.print(obj.displayK(row, size) + " "+ obj.displayS(row, size) + " "+ obj.displayH(row, size) + " "+ obj.displayI(row, size) + " "+ obj.displayT(row, size) + " "+ obj.displayI(row, size) + " " + obj.displayJ(row, size) + " " +obj.displayA(row, size) + " "+ "\n");
          }
    
}
}

