import java.util.Scanner;

public class Sample111 {
  public static void main(String[] args) {
    // 整数型の変数を宣言する
    int a, b, ans;

    //　キーボードから２つの整数を入力する
    Scanner scn = new Scanner(System.in);
    System.out.print("１つ目の整数を入力してください = ");
    a = scn.nextInt();
    System.out.print("２つ目の整数を入力してください = ");
    b = scn.nextInt();
    
    // ２つの整数を加算する
    ans = a + b;
    
    // 加算結果を画面に表示する
    System.out.println("加算結果 = " + ans);
  }
}
