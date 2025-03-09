import java.util.Random;

public class Practical10{

public static void main(String[] args){
   int size = 100;
   int[][] grid = create(size);
   remove(grid,size);
   print(grid,size);
   }
   
 public static int[][] create(int size){
   int[][] grid = new int[size][size];
   
   for(int i=0; i<size; i++){
     for(int j=0; j<size; j++){
        grid[i][j] = (i+j) % size +1; 
        }
     }
     return grid;
   }
   
  public static void remove(int[][] grid, int size){
    Random randomNo = new Random();
    int toRemove = (size*size)/3;
     while(toRemove > 0){
         int i= randomNo.nextInt(size);
         int j= randomNo.nextInt(size);
         
         if(grid[i][j] !=0){
          grid[i][j] = 0;
          toRemove--;
          }
       }
    }
    
  public static void print(int[][]grid, int size){
    int maxDigit = String.valueOf(size).length();
    int cellWidth = maxDigit + 2;
    
    StringBuilder s = new StringBuilder(".");
    for(int i=0; i<size; i++){
       s.append("-".repeat(cellWidth)).append(".");
      }
     String s1 = s.toString();
     System.out.println(s1);
    for(int i =0; i<size; i++){
       System.out.print("|");
      for(int j=0; j<size; j++){
         String str = (grid[i][j] ==0 ? " ".repeat(maxDigit) : String.format("%" + maxDigit + "d", grid[i][j]));
         System.out.print(" " + str + " |");
        }
        System.out.println();
        System.out.println(s1);
       }
     }
   }
   
        
