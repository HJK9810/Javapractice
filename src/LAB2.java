
public class LAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0; // a���� ������ ���
		double b = -3.0;
		double c = 2.0;
		double x, y;
		double Route;
		
		Route = b * b - 4.0 * a * c;
		x = (- b + Math.sqrt(Route)) / (2 * a); // Math.sqrt�Լ����� ���� �����ؼ� ��굵 ����
		y = (- b - Math.sqrt(Route)) / (2 * a);
		
		System.out.println("���� : " + x);
		System.out.println("���� : " + y);
	}

}
