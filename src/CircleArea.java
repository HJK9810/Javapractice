// LAB3
import java.util.*;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		radius = input.nextInt();
		
		area = radius * radius * 3.14;
		
		System.out.printf("���� ���� : %6.1f", area);
	}

}
