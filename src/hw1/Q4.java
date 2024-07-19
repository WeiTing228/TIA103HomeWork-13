package hw1;

public class Q4{
    public static void main(String[] args) {
    	//圓周率3.1415，計算半徑為5的圓面積與圓周長
    	double PI = 3.1415;
    	int r = 5;
    	double area = PI * (r * r);
    	double length = 2 * PI * r;
    	System.out.printf("圓周長：%.2f"+ "公分%n" ,length );
    	System.out.printf("圓面積：%.2f"+ "平方公分%n",area );
    }
}