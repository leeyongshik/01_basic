package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int a = scan.nextInt();
		
		String b = a % 2 == 0  ? "짝수" : "홀수" ;
		String c = a % 2 == 0 && a % 3 == 0 ? "공배수이다" : "공배수 아니다" ;
		
		System.out.println(a + "는 " + b);
		System.out.println(a + "는 2와 3의 " + c);

	}

}

/*
[문제] 정수를 입력하여 짝수? 홀수?, 2와 3의 공배수이냥? 아니냥?

[실행결과]
정수 입력하시오 : 12
12는 짝수
12는 2와 3의 공배수이다
----------------------
정수 입력하시오 : 15
15는 홀수
15는 2와 3의 공배수 아니다
*/