package hw1;

public class Q2 {
  public static void main(String[] args) {
    //計算200顆蛋共是幾打幾顆？
	int egg = 200;
	int dozen = 12;
	double result = egg / dozen;
	int remainer = egg % dozen;
	System.out.println("200顆雞蛋共是" + (int)result + "打又" + remainer+"顆。");
		
	
  }
}
