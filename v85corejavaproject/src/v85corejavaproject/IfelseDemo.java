package v85corejavaproject;
import java.util.Scanner;

public class IfelseDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible for voting");
			System.out.println("bring id");
		}
		else
		{
			System.out.println("not eligible");
		    System.out.println("You need to wait for somemore years");
		}
		System.out.println("vote for india");

	}

}
