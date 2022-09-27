package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3; //casting(강제형변환)
		
		String c = "25";
		// int d = (int) c; - error -> 객체는 객체끼리 형변환 가능 / 기본형은 기본형끼리 형변환 가능
		int d = Integer.parseInt(c);
		
		int e = 5;
		Integer f = e; //AutoBoxing - JDK 5.0 이후 버전부터 가능
		//Integer g = new Integer(e); // AutoBoxing - JDK 5.0 이전 버전
		
		int h = 5;
		Integer i = h; //AutoBoxing - JDK 5.0 이후 버전부터 가능
		//Integer j = h.intValue(); // AutoBoxing - JDK 5.0 이전 버전

	}

}
