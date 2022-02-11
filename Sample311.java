public class Sample311 {
  public static void main (String[] args) {
    // 2の3乗を求める
    System.out.println("2の3乗 = " + Math.pow(2, 3));
    
    // 2の平方根を求める
    System.out.println("2の平方根 = " + Math.sqrt(2));
    
    // 1～6の乱数を１０個生成する
    System.out.print("1～6の整数 = ");
    for (int i = 1; i<=10; i++) {
      System.out.print((int)(Math.random() * 6 + 1) + ", ");
    }
    System.out.println();
  }
}