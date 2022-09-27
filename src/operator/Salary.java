package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat();
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("직급 입력: ");
		String pos = scan.next();
		System.out.print("기본급 입력: ");
		int base = scan.nextInt();
		System.out.print("수당 입력: ");
		int pay = scan.nextInt();
		
		int sum = base + pay ;
		double tax = sum >= 5000000 ? sum * 0.03 : sum>=3000000 ? sum*0.02 : sum*0.01 ;
		int sal = sum - (int)(tax);
		
		System.out.println();
		System.out.println("*** " + name + " " + pos + " 월급 ***");
		System.out.println("기본급 : " + comma.format(base) + " 원");
		System.out.println("수당 : " + comma.format(pay) + " 원");
		System.out.println("합계 : " + comma.format(sum) + " 원");
		System.out.println("세금 : " + comma.format((int)(tax)) + " 원");
		System.out.println("월급 : " + comma.format(sal) + " 원");
		

	}

}

/*
단 합계가 5,000,000원 이상이면 3%
3,000,000원 이상이면 2%
아니면 1%

합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/