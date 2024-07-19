package hw2;

public class TIA103_13HW2 {
//	public static void main(String[] args) {
//		//使用for迴圈+while迴圈
//		System.out.println("使用 for迴圈 + while迴圈：");
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.printf(i + "*" + j + "=" + i * j + "\t");
//				j++;
//			}
//			System.out.println();
//		}
//	}

//	    //使用 for迴圈 + do while迴圈
//	public static void main(String[] args) {
//		System.out.println("使用 for迴圈 + do while迴圈：");
//		for (int i = 1; i <= 9; i++) {
//			int j = 1;
//			do {
//			    System.out.printf(i + "*" + j + "=" + i * j + "\t");
//			    j++;
//			}while (j <= 9);				
//			System.out.println();
//		}
//	}

	// 使用 while 迴圈+ do while 迴圈
//	public static void main(String[] args) {
//		System.out.println("使用 while 迴圈 + do while迴圈：");
//		int i = 1;
//		while (i <= 8) {
//			i++;
//			int j = 1;
//			do {
//			   System.out.printf(i + "*" + j + "=" + i * j + "\t");
//			   j++;
//			}while (j <= 9);				
//			System.out.println();
//		}
//	}

//	//計算 1 ~ 1000的偶數和
//   public static void main(String[] args){
//       int sum = 0;
//    	 for(int i = 1; i <= 1000; i++)
//    	    if (i % 2 == 0 ) {
//    		sum += i;
//    	    }
//    	    System.out.println("1 ~ 1000的偶數和是" + sum);
//   }

//    //計算 1 ~ 10的連乘積 (使用 for 迴圈)
//    public static void main(String[] args){
//        int result = 1;
//    	  for(int i = 1; i <= 10; i++)
//            result *= i;
//            System.out.println("1 ~ 10 的連乘積是：" + result);
//    }

//	  //計算 1 ~ 10 的連乘積 (使用 while 迴圈)
//	  public static void main(String[] args) {
//	      int i = 1, result = 1;
//		  while (i <= 10) {
//			  result *= i;
//			  i++;
//		  }
//		  System.out.println("1 ~ 10 的連乘積是" + result);
//	  }

//	//輸出結果為1 4 9 16 25 36 49 64 81 100
//	public static void main(String[] args) {
//		int result = 0;
//		for(int i = 1; i <= 10; i++) {
//		    result = i * i;
//			System.out.println(result);
//		}
//	}
	
//	// 1 ~ 49中，個位數或十位數不能出現4，有哪些？有多少個？
//	public static void main(String[] args) {
//		int counts = 0;
//		for(int i = 1; i <= 49; i++) {
//			if (i % 10 != 4 && i % 100 / 10 != 4) {
//				System.out.print(i + " ");
//				counts += 1;
//			}
//		}
//		System.out.println("共有" + counts + "個");
//	}
	
	//輸出結果為
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
	
//	public static void main(String[] args) {
//		int layer = 10;
//		for (int i = layer ; i >= 1 ; i-- ) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	//輸出結果為
////	A
////	BB
////	CCC
////	DDDD
////	EEEEE
////	FFFFFF
//	public static void main(String[] args) {
//		int layer = 7;
//		for (int i = 1 ; i <= layer ; i++){
//			char letter = (char)('A' + i - 2);
//			for (int j = 1; j < i ; j++) {
//				System.out.print(letter);
//			}
//		    System.out.println();
//		}
//	}
	
}
