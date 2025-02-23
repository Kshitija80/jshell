class Practical9{

  public static void main(String[] args){
    int size = Integer.parseInt(args[0]);
    
    int [] arr =  create_array(size);
    compare_strings(arr);
    compare_fact(arr);
   }
     public static int[] create_array(int size){
    int[] arr = new int[size];
    for(int i = 0 ; i < size ; i++){
        arr[i] = (int)(System.nanoTime()%size+1);
      }
    return arr;  
    }
  public static void  compare_strings(int[] arr){
  	String s ="";
  	StringBuilder sb = new StringBuilder("");
  	StringBuffer sf = new StringBuffer("");
  	String st ="";
  	StringBuilder sbt = new StringBuilder("");
  	StringBuffer sft = new StringBuffer("");
        long s_avg = 0 ;
        long  sb_avg = 0;
        long  sf_avg = 0 ;
  	for(int i = 0 ; i < arr.length ;i++){
  	for(int j = 0 ; j <arr[i] ; j++){
  	   char ch = (char)(System.nanoTime()%26+65);
  	   sb.append(ch);
  	   s += ch;
  	   sf.append(ch);	
  		}
  	
       long x = System.nanoTime();
       st += s;
       long y = System.nanoTime();
       s_avg += y - x;
       x = System.nanoTime();
       sbt.append(sb);
       y = System.nanoTime();
       sb_avg += y-x;
       x = System.nanoTime();
       sft.append(sf);
       y = System.nanoTime();
       sf_avg += y-x;
  	}
  	System.out.print("avg time required by string : ");
  	System.out.println(s_avg);
  	System.out.print("avg time required by stringBuffer : ");
  	System.out.println(sf_avg);
  	System.out.print("avg time required by stringBuilder : ");
  	System.out.println(sb_avg);
  	
       
  	
  	}
    static void compare_fact(int []arr){
        long avg = 0 ;
       long avg1 =0 ;
  
       for(int i = 0 ; i <arr.length ;i++){
        
           int val = arr[i];
           long x = System.nanoTime();
           getFactorial1(val);
           long y = System.nanoTime();
            avg = y - x;
            x = System.nanoTime();
            getFactorial3(val);
             y = System.nanoTime();
           avg1 = y-x;
           }
       System.out.print("avg time required by using loop : ");
        
       System.out.println(avg);
        System.out.print("avg time required by without loop : ");
        
       System.out.println(avg1);
    
       
       }
   static int getFactorial1 (int num){  // Using for loop.
        int fact=1;
       for(int i=num; i>0; i--)
        {
        fact=fact*i;
        }
        return fact;
   }
    static int getFactorial3(int num) // Without using loop.
   {
      int fact=1;
       if(num==0 || num==1){
         return 1;
         }
     else {
           fact=num*getFactorial3(num-1);  
         }
   return fact;
   }
   }
