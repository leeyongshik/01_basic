package operator;

public class Operator04 {

	public static void main(String[] args) {
		int a = 5;
		a += 2 ; // a = a + 2
		a *= 3; // a = a * 3
		
		System.out.println("a = " + a);
		
		// ++a (선행) / a++ (후행)
		a++;
		System.out.println("a = " + a);
		
		int b = a++; // 1. int b = a ;  / 2. a++; 순서로 처리
		System.out.println("a = " + a + "   b = " + b);
		
		int c = ++a - b--;
		System.out.println("a = " + a + "   b = " + b + "   c = " + c );
		
		System.out.println("a++ = " + a++); // 24
		System.out.println("a = " + a); // 25
		

	}

}
