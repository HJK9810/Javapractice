
public class LAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������� ����
		double distance = 40e12; // �־��� ���� : km
		double secs;
		double lightspeed = 3e5; // �־��� ���� : km/sec
		double time; // ������
		
		secs = distance / lightspeed;
		time = secs/(60.0 * 60.0 * 24.0 * 365.0);
		
		System.out.println("�ɸ��� �ð��� " + time + "���� �Դϴ�."); // ������ �����̴� ������ �ʼ�
		*/
		// ������ȣ ���� ����
		double distance = 40e12; // �־��� ���� : km
		double secs;
		final double shipspeed = 60e3; // �־��� ���� : km/sec
		double time;
		
		secs = distance / shipspeed;
		time = secs / (60.0 * 60.0 * 24.0 * 365.0);
		
		System.out.println("������ȣ�� �ɸ��� �ð��� " + time + "�� �Դϴ�.");
	}

}
