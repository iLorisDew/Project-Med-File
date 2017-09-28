package degreeConverter;

import java.util.Scanner;

public class tempConvers 
{

	public static void main(String[] args) 
	{
		char rep = 'O';
		
		while(rep== 'O') 
		{
			Scanner scan = new Scanner(System.in);
			int choice;
		
			System.out.println("Hello welcome to the temperature converter.");
			System.out.println("Choose the type of conversion you wish: ");
			System.out.println("1. From Celsius to Fahrenheit.");
			System.out.println("2. From Fahrenheit to Celsius.");
		
			do
			{
				System.out.println("Choice: ");
				choice = scan.nextInt();
			
			}while(choice != 1 && choice != 2);
		
			switch(choice)
			{
			case 1:
				System.out.println("From C to F");
				System.out.println("Give the variable you want to convert");
				float tempC = scan.nextFloat();
			
				tempC = tempC * 9/5;
				tempC = tempC+32;
			
				System.out.println(tempC);
			
				break;
		
			case 2:
				System.out.println("From C to F");
				break;	
			
			}
			rep = ' ';
		
			do 
			{
				System.out.println("Voulez-vous réessayer ? (O/N)");
				scan.nextLine();
				String reponse = scan.nextLine();
				
				rep = reponse.charAt(0);
								
			}while(rep != 'O' && rep !='N');
			
			System.out.println("Thank you & have a nice day.");
			System.out.println("Github update test.\n");
			System.out.println("Github update test 2. »);
		}
		
	}
}
