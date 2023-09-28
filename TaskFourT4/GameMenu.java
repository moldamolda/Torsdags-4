import java.util.Scanner;
import java.util.ArrayList;
public class GameMenu{
	
public ArrayList<String> actions;

public GameMenu(ArrayList<String> actions, ){

this.actions = actions; 

}

public void displayMenu(){

	for (String k : actions){
	System.out.println(k);
	}

}

public String getAction(){
Scanner scanner = new Scanner(System.in); 

System.out.println("Type a number to choose an action");
displayMenu();
String choice = scanner.next();
return choice;


}



}