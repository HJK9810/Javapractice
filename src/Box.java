// LAB4
import java.util.*;

public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double w, h, area, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�簢���� ���θ� �Է��Ͻÿ� : ");
		w = input.nextDouble();
		
		System.out.println("�簢���� ���θ� �Է��Ͻÿ� : ");
		h = input.nextDouble();
		
		area = w * h;
		perimeter = 2 * (w + h);
		
		System.out.println("�簢���� ���̴� " + area + "\n" + "�簢���� �ѷ��� " + perimeter);
		// System.out.println("�簢���� �ѷ��� " + perimeter);
		}

}
