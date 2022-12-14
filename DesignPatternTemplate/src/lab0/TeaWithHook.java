package lab0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
	@Override
	boolean customerWantsCodiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		// get the user's respone
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
}
