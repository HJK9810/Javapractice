import java.util.*;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단중 출력할 단을 선택 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i = 1 ; i<10 ; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}

}
