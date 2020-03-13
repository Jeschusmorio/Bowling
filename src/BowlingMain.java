import java.util.Scanner;

public class BowlingMain {
	static Scanner sc = new Scanner(System.in);
	int score;

	public static void main(String[] args) {
		
		int[] bVals = input();
		System.out.println("Rounds: " + bVals[0]);
		System.out.print("Throws:");
		for (int i = 1; i < bVals.length; i++) {
			System.out.print(" " + bVals[i]);
		}
		
		output();
		sc.close();
	}
	public static int[] input() {
		System.out.println("Input: <Number of Rounds>:<Throw1>,<Throw2>,<Throw3>, …");
		System.out.print("Input: ");
		String input = sc.next();
		int[] val = splitInput(input);
		return val;
	}
	//bVals[0] = Number of Rounds; bVals[1...] = throws
	public static int[] splitInput(String input) {
		String[] parts = input.split(":");
		int numOfRounds = Integer.parseInt(parts[0]);
		String[] t = parts[1].split(",");
		int[] bVals = new int[t.length + 1];
		bVals[0] = numOfRounds;
		for (int i = 1; i <= t.length; i++) {
			bVals[i] = Integer.parseInt(t[i - 1]);
		}
		return bVals;
	}

	private static void output() {
		
	}

	
}
