package lab1;
/*
 * Write a java program that simulates a traffic light. The program lets the user 
 * select one of three lights: red, yellow, or 
 * green with radio buttons. On entering the choice, an appropriate message with 
 * “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 * 
 */
import java.util.Scanner;

public class exercise2 {
	
	public static String trafficLights(String choice) {
		switch(choice) {
		case "red":
			return "Stop";
		case "yellow":
			return "Ready";
		case "green":
			return "Go";	
		default:
			return "button not available";
		}	
	}
	
	public static void main(String[] args) {
		
		String button;
		System.out.println("Enter any button (red, yellow, green)");
		Scanner sc =new Scanner(System.in);
		button = sc.next();
		System.out.println(button);
		System.out.println(trafficLights(button));
		
	}

}
