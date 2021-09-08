import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		String userInput = "x";
		
		while (!userInput.equals("")) {
			System.out.print("Enter a name: ");
			userInput = sc.nextLine();
			if (!userInput.equals("")) {
				names.add(userInput);
			}
		}

		int randomNum = rand.nextInt(((names.size()-1) - 0) + 1) + 0;
		
		System.out.print("The winner is... " + names.get(randomNum) + ".");
		
		
		sc.close();
		
	}

}
