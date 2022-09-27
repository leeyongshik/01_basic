package operator;

import java.util.Random;

public class Home01 {

	public static void main(String[] args) {
		Random num = new Random();
		int num1 = num.nextInt(6)+1;
		int num2 = num.nextInt(6)+1;
		
		System.out.println("주사위 1 : "+ num1 + "\t주사위 2 : " + num2);
		System.out.println(num1 == num2 ? "주사위1과 주사위2가 같다" : num1 > num2 ? "주사위1 이 " + num1 + "으로 승" : "주사위2 이 " + num2 + "으로 승");
		System.out.println("합 = " + (num1+num2));

	}

}

/*
[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 이 3으로 승
합 = 4
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 이 6으로 승
합 = 10
-----------------------------
주사위1 : 3   주사위2 :3
주사위1과 주사위2가 같다
합 = 6
*/