
public class LAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 광년계산용 예제
		double distance = 40e12; // 주어진 단위 : km
		double secs;
		double lightspeed = 3e5; // 주어진 단위 : km/sec
		double time; // 광년계산
		
		secs = distance / lightspeed;
		time = secs/(60.0 * 60.0 * 24.0 * 365.0);
		
		System.out.println("걸리는 시간은 " + time + "광년 입니다."); // 단위가 광년이니 광년계산 필수
		*/
		// 보이저호 계산용 예제
		double distance = 40e12; // 주어진 단위 : km
		double secs;
		final double shipspeed = 60e3; // 주어진 단위 : km/sec
		double time;
		
		secs = distance / shipspeed;
		time = secs / (60.0 * 60.0 * 24.0 * 365.0);
		
		System.out.println("보이저호의 걸리는 시간은 " + time + "년 입니다.");
	}

}
