import java.util.Arrays;
import java.util.Scanner;

public class ModulusProject
	{

		public static void main(String[] args)
			{
//				exercise1();
//				
//				exercise2();
//				
				exercise3();

			}

	

		public static void exercise1(){
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please input a number? ");
			int name = input.nextInt();
			
			if(name % 2 == 0){
				System.out.println("The number you input " + name + " Is Even");	
				
			}else{
				System.out.println("The number you input " + name + " Is Odd");
			
			}
			
			
			
		}

	


	public static void exercise2(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a year ");
		int name = input.nextInt();
		
		if(name % 4 == 0){
			System.out.println("The year you input " + name + " is a leap year");
		}else{
			System.out.println("The year you input " + name + " is not a leap year");
		}
		
	}
	
	public static void exercise3(){
		
				int[] numbers = {2,5,-7,1,3,12,19,-16,4,20};  
				    for (int i = 0; i < numbers.length; i++) {
				        if (numbers % 3 == 0 && i > 0) {
				            System.out.println();
				        }
				        System.out.print(numbers[i] + " ");
				    }
		
		
	}
	
	}

	
	
