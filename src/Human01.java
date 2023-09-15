
public class Human01 { //publicでどこからでもアクセスできるHuman01を定義
   public String name; // publicでどこからでもアクセスできるメンバー変数nameとageを定義する
   public int age;
   
   public Human01() { // 引数なしのコンストラクタを定義する、これを用いて初期化した場合下記の通り初期化される
	   name = "山田";
	   age = 20;
   }
   public Human01(String name, int age) { // 引数2つ（Stringとint）のコンストラクタを定義、これを用いて初期化した場合nameもageも引数として渡した値(nameとage)で初期化される
	   this.name = name;
	   this.age = age;
   }
}
