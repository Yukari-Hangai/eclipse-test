
public class ClassMethod01 {
   public static void main(String[] args) {
	   Human01 yamada = new Human01(); // 引数なしのコンストラクタを用いてHuman01クラスのインスタンスを生成
	   System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。"); // コンストラクタHuman01の初期値が表示される
	
	   Human01 sato = new Human01("佐藤", 25); // 引数を2つ用いてHuman01のクラスのインスタンスを生成
	   System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。"); // コンストラクタの引数に渡した値が表示される
   }
}
