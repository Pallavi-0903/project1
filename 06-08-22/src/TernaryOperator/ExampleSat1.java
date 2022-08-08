package TernaryOperator;

import java.util.Scanner;

public class ExampleSat1 {
	
	public static void main(String[] args) {
		 int personAge;
		 boolean condition;
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter person age : ");
		 personAge = scanner.nextInt();	
		 
	 
		 scanner.close();
		 
		 condition = personAge>18;
		 
		 System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 
		 String str1="able to give vote";
		 String str2 ="not able to give vote";
		 
		 System.out.println(condition? str1:str2);	 
		 
	}

}
