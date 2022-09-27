package variable;

public class Variable02 {
	static int a; //필드, 초기화 되어 있다.
	int b;
	
	public static void main(String[] args) {
		int a = 100; // local variable(지역변수), 쓰레기값, 반드시 초기화 해야 한다.
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 a = " + Variable02.a);
		System.out.println("필드 b = " + new Variable02().b);
	}

}
