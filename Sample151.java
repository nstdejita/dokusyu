import java.util.Scanner;

public class Sample151 {
  public static void main (String[] args) {
    // 西暦をキーボード入力する
    Scanner scn = new Scanner(System.in);
    System.out.print("西暦を入力してください = ");
    int year = scn.nextInt();
    
    // うるう年かどうかを判定する
    if (year % 4 == 0 && year %100 != 0 || year % 400 == 0) {
      System.out.println("うるう年です");
    }
    else {
      System.out.println("うるう年ではありません");
    }
  }
}