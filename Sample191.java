public class Sample191 {
  public static void main (String[] args) {
    // テストの得点を格納した配列
    int[] score = { 85, 73, 92, 55, 41 };
    
    // 合計値を求める
    int sum = 0;
    for (int i = 0; i < score.length; i++) {
      sum += score[i];
    }
    
    // 平均点を求める
    double ave = sum / (double)score.length;
    System.out.println("平均点 = " + ave);
  }
}