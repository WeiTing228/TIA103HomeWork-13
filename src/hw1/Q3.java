package hw1;

public class Q3 {
	public static void main(String[] args) {
	    //算出256559秒為多少天、多少小時、多少分與多少秒?
		int time = 256559;
	    int seconds = time % 60;
	    int minutes = (int)time / 60;
	    int hours = (int)minutes / 60;
	    int days = (int)hours / 24;
	    System.out.println("256559秒為" + days + "天、" + hours + "小時、"+ minutes + "分。" );
	}
	}
