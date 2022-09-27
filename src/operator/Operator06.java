package operator;

public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple" ; // literal 생성
		String c = new String("apple");
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); // 참조값 
		System.out.println("b != c : " + (b != c ? "참 " : "거짓 "));
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다 " : "다르다 ")); // 문자열
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참 " : "거짓 "));
		
		
	}

}
