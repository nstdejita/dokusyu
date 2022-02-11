public class Sample1131 {
  // daikeiメソッド
  public static double daikei(double joutei, double katei, double takasa) {
    double menseki;
    menseki = (joutei + katei) * takasa / 2.0;
    return menseki;
  }
  
  // mainメソッド
  public static void main (String[] args) {
    double ans = Sample1131.daikei(4.0, 6.0, 5.0);
    System.out.println("台形の面積 = " + ans);
  }
}