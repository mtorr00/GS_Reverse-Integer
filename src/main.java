import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int before;
		while (true) {
			try {
				System.out.println("Enter the integer to be reversed: ");
				before = input.nextInt();
				break;
			}catch (InputMismatchException e) {
				System.out.println("Wrong type; please enter an Integer:");
				input.nextLine();
			}
		}
		int after;
		after = ReversedInteger(before);
		System.out.println(after);
		input.close();
	}

	public static int ReversedInteger(int pre) {
		int result;
		String a,b = "";
		a = Integer.toString(pre);
		
		for (int i = a.length()-1; i >=0; i--) {
			b+=a.charAt(i);
		}
		result = Integer.parseInt(b);
		return result;
	}
}
