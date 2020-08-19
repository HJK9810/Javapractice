// LAB3
import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("반지름을 입력하시오 : ");
		radius = input.nextInt();
		
		area = radius * radius * 3.14;
		
		System.out.printf("원의 넓이 : %6.1f", area);
	}

}
