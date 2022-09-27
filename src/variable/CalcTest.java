package variable;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		short a, b, sum;
		int sub, mul;
		double div;
		
		a = 320;
		b = 258;
		sum = (short)(a + b);
		sub = a-b;
		mul = a*b;
		div = (double)(a)/b; // 강제형변환 -> 나머지도 자동형변환
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.5f",div));
		
	}

}
/*
[문제]변수를 이용하여 320과 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오.
[실행결과] 
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = xxx
*/