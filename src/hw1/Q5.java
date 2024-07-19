
package hw1;

public class Q5 {
	   public static void main(String[] args) {
		   //銀行存入150萬元，銀行利率 2%，每年繼續存入銀行，10年後本金加利息共有多少錢?
		   //金額 ＝ 本金×（1 ＋ 利息）*年
		   int money = 1_500_000;
		   double rate = 0.02;
		   int years = 10;
	       double total = money * (Math.pow((1 + rate),10));
	       System.out.printf("本金加利息共有" + (int)total + "元" );
	    }
}