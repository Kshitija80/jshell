public class Practical5{

int getFactorial1 (int num){  // Using for loop.
  int fact=1;
  for(int i=num; i>0; i--)
  {
   fact=fact*i;
   }
   return fact;
   }
   
  int getFactorial2 (int num){  // Using While loop
  int fact=1;
  while(num>0)
  {
    fact= fact *num;
    num--;
   }
  return fact;
  }
  
  int getFactorial3(int num) // Without using loop.
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
   
   int getSum (int[]numbers) // Using while loop.
   {
       int sum=0;
       int i=0;
   while(i<numbers.length)
    {
      sum+=numbers[i];
      i++;
    }
    return sum;
   }
    
   int getSum(int[]numbers, int i){ // Without using while loop.
    if(i==numbers.length)
    {
      return 0;
    }
    else{
       return numbers[i] + getSum(int[]numbers, int i+1);
       }
    return sum;
     }
   }
   
   public static void main(String[] args) {
        Practical5 xyz = new Practical5();
        int[]arr={ 2,4,6,8,0};
        
       System.out.println(xyz.getFactorial1(5));
       System.out.println(xyz.getFactorial2(6));
       System.out.println(xyz.getFactorial1(6));
       System.out.println(xyz.getSum(arr));
       System.out.println(xyz.getSum(arr,1));
       
       }
       
    }
       
