import java.util.Scanner;
import java.util.ArrayList;
class Main{



public static void main(String[] args){

	getAction();
	
ArrayList<String> actions = new ArrayList<>();

actions.add("1) Start game");
actions.add("2) Resume game");
actions.add("3) Pause game");
actions.add("4) End game");


GameMenu gM = new GameMenu(actions);
gM.getAction();


}
}