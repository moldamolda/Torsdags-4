import java.util.Scanner;
import java.util.ArrayList;
public class Main{
public static void main(String [] args){
int retireAge = 67;

	
Scanner scanner = new Scanner(System.in);

System.out.println("\nPlease type your name");
String name = scanner.next();

System.out.println("your name is: " + name + "\nPlease type you age");
int age = scanner.nextInt();

System.out.println("your age is: " + age);


if (age >= retireAge){

	System.out.println("you can now retire");

} else{

	int yearsUntilRetire = retireAge - age;
	System.out.println("you have " + yearsUntilRetire + " years until retirement");
}









	}
}