package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
	
	int money = 5738;
	DecimalFormat comma = new DecimalFormat();
	
	System.out.println("현금 "+comma.format(money)+" 원");
	System.out.println("천의 자리 : " + money / 1000);
	System.out.println("백의 자리 : " + (money % 1000) / 100);
	System.out.println("십의 자리 : " + ((money % 1000) % 100) / 10);
	System.out.println("일의 자리 : " + ((money % 1000) % 100) % 10);

	}

}

