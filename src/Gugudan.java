import java.util.*;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("출력할 구구단은? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.print("값을 잘못 입력했습니다.");
		} else {
			for(int i = 1 ; i<10 ; i++) {
				System.out.println(num + " X " + i + " = " + num * i);
			}
		}
	}

}
