package hw1;

public class Q6 {
    public static void main(String[] args) {
    	//印出 5+5 、 5+'5' 、 5+"5"，說明答案產生原因
    	System.out.println(5 + 5); //兩個5皆為數字，執行結果為兩數相加
    	System.out.println(5 + '5'); //第一個5為數字，第二個5在ASCII表中代表十進位數字53，執行結果為兩數相加
    	System.out.println(5 + "5"); //第一個5為數字，第二個5使用雙引號，電腦判斷為字串，執行結果為數字與字串相連接
    }
}