package lab6;
import java.util.Map;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

/*
 * Exercise 6: Create a method which accepts the id and the 
 * age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 */
public class exercise6 {

public static List<String> eligibilityList(Map<String, String> votersMap) {
		
		Period age;
		LocalDate voterDOB;
		
		List<String> voterList = new ArrayList<String>();
		
		for (Map.Entry<String, String> voter : votersMap.entrySet()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			voterDOB = LocalDate.parse(voter.getValue(), formatter);
			age = Period.between(voterDOB, LocalDate.now());
			
			if (age.getYears() > 18) {
				voterList.add(voter.getKey());
			}
		}
		return voterList;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of voters you want on the list: ");
		int n = Integer.parseInt(sc.nextLine());
		
		String id;
		String dob;
		
		Map<String, String> votersMap = new HashMap<String, String>();
		
		for (int i=0;i<n;i++) {
			System.out.print("\nEnter the ID of the "+(i+1)+" voter: ");
			id = sc.nextLine();
			System.out.print("\nEnter the D.O.B (dd/MM/yyyy) of the "+(i+1)+" voter: ");
			dob = sc.nextLine();
			votersMap.put(id, dob);
		}
		
		System.out.println("Here are the ID's of the voters who are eligible to vote...");

		for (String identity : eligibilityList(votersMap)) {
			System.out.println(identity.toString());
		}
		
		sc.close();
	}

}
