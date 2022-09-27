package variable;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		int a = 10; // 정수형 변수 , 지역변수
		System.out.println("지역변수 a = " + a);
		
		Random r = new Random(); // 객체
		System.out.println(r);
		System.out.println("객체 r = " + r.nextDouble());
		System.out.println("객체 r = " + r.nextInt());
		System.out.println("객체 r = " + r.nextInt(100)); // 0~99
		System.out.println(r.nextInt(26) + 65); // 65~90
		
		String b = new String("사과");
		String c = "딸기"; //문자열 lteral 생성
		
		System.out.println(b + "\t" + c);

	}

}
