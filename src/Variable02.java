
public class Variable02 {
   // static final = 定数の宣言
   static final int MIN_NUMBER = 10;
   
   public static void main(String[] args) {
	   System.out.println(MIN_NUMBER);
	   // 代入しようとするとエラー
	   // MIN_NUMBER = 20;
	   
	   // final定数の宣言
	   final int maxValue;
	   // 一度は値を設定できる
	   maxValue = 100;
	   System.out.println(maxValue);
	   // 再代入しようとするとエラー
	   // maxValue = 200;
   }
}
