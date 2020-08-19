import java.util.*;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("Chose the number for Times Table? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.print("You put the wrong number.");
		} else {
			for(int i = 1 ; i<10 ; i++) {
				System.out.println(num + " X " + i + " = " + num * i);
			}
		}
	}

}
