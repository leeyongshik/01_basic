package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		
		boolean a = false; // 대입문
		System.out.println("a = " + a);
		
		char b = 'A';
		System.out.println("b = " + b);
		
		char c = 65;
		System.out.println("c = " + c);
		
		// byte d = 128; => error byte는 127까지 기입 가능
		
		int e = 65;
		System.out.println("e = " + e);
		
		int f = 'A';
		System.out.println("f = " + f);
		
		long g = 65L; // 65L은 long형 상수
				
		//float h = 43.8; //error 43.8은 double형 상수
		float h = 43.8f; // 43.8f는 float형 상수
		float h2 = (float)43.8; // 강제형변환 (Cast연산)
		System.out.println("h = " + h);
		
		
	}

}
