package homeAssignments;

public class NumberIsPrime
{
   public static void main(String[] args)
   {
	int a=20;
	int reminder;
	int i=2;
//	System.out.println("Welcome");
	 while(i<a-1)
	 {
		 reminder = a%i;
		 //System.out.println(reminder);
		 if(reminder == 0){
			 
			 System.out.println("This is NOT a prime number:"+a );
			 i++;
			 break;
			 
		 }
		 else {
			 i++;
		 }
//		 System.out.println("i"+i);
     }
	 if (i==a-1)
	 {
		 System.out.println("This is a prime number:"+a);
	 }
 	
   }
}
