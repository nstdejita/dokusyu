import java.util.Scanner;

public class Sample181 {
  public static void main (String[] args) {
    Scanner scn = new Scanner(System.in);
    int num, ans;
    
    // 乱数で1～100の数を選ぶ
    num = (int)(Math.random() * 100) + 1;
    
    // 数を当てるまで繰り返す
    do {
      System.out.print("いくつだと思いますか？ = ");
      ans = scn.nextInt();
      if (num > ans) {
        System.out.println("もっと大きいです。");
      }
      else if (num < ans) {
        System.out.println("もっと小さいです。");
      }
    } while (ans != num);
    
    System.out.println("正解です！");
  }
}