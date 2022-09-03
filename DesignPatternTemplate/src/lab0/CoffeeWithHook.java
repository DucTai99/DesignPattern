package lab0;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
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
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (Exception e) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
