package homeAssignments;

public class CheckPrimenumber
{
  public static void main(String[] args)  
  
  {
	int a= 17;
	
	for (int i = 2; i<=a-1; i++) 
	{
		if (a%i==0)
		{
			System.out.println("number is not prime");
			break;
		}	
		else if (i==a-1) 
		{
			System.out.println("number is prime");
		} 	
		//System.out.println("number is not prime");
		 
		}
	
  }
}
