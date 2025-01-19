package assiggnments;

public class As11_LeapYear 
{
	public static void main(String[] args) 
	{
		int ST =1990;
		int ET=2024;
		System.out.println("Leap year between 1990 and 2024 is below");
		//365 days in a year || 366 in leap year
		//2000,2020,2024-> dosent leave out remainder-> Completely divisible by 4
		for (int year=ST; year<=ET; year++) 
		{
			if (year %4==0 ) 
			{
			System.out.println(year+" is a leap year");
			}
			else
			{
			System.out.println(year+" is not a leap year");
			}
		}
		System.out.println("Test of Poll SCM _ by Pritam");
	}

}
