
public class LAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0; // a값을 가정한 경우
		double b = -3.0;
		double c = 2.0;
		double x, y;
		double Route;
		
		Route = b * b - 4.0 * a * c;
		x = (- b + Math.sqrt(Route)) / (2 * a); // Math.sqrt함수값을 따로 저장해서 계산도 가능
		y = (- b - Math.sqrt(Route)) / (2 * a);
		
		System.out.println("근은 : " + x);
		System.out.println("근은 : " + y);
	}

}
