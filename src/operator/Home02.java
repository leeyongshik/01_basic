package operator;

import java.util.Scanner;

public class Home02 {

	public static void main(String[] args) {
		//char ch = 'T';
		char ch = 'h';
		
		int ch1 = ch >= 'A' && ch <= 'Z' ? ch + 32 : ch - 32;
		System.out.println(ch + " -> "+(char)(ch1));
	}

}

/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b         e -> E
*/