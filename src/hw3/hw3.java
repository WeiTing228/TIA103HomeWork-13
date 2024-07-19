package hw3;

import java.util.Scanner;

public class hw3 {

//	public static void main(String[] args) {
//		int i = 1;
//		int length1; 
//		int length2;
//		int length3;
//		while(i > 0) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("請輸入三個整數：");	
//			length1 = sc.nextInt();
//			length2 = sc.nextInt();
//			length3 = sc.nextInt();
//			if (length1 == length2 && length1 == length3) {
//				System.out.println("此為正三角形");
//			}else if(length1 == length2 || length1 == length3 || length2 == length3 ) {
//					System.out.println("這是等腰三角形");	
//			}else if(length1 == 0 || length2 == 0 || length3 == 0){
//					System.out.println("這不是三角形");
//			}else
//				System.out.println("這是其它三角形");
//			i++;
//		}
//	}

	public static void main(String[] args) {
		int num = 1;
		while( num > 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入討厭的數字：");	
			num = sc.nextInt();
			for(int i = 1; i <= 49; i++) {
				if (i % 10 != 4 && i % 100 / 10 != 4) {
					System.out.print(i + " ");
					counts += 1;
				}
			}
			System.out.println("共有" + counts + "個");
		}
		}

	
	}
}
