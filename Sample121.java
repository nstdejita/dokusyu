public class Sample121 {
  public static void main(String[] args) {
    // 台形の面積を計算する
    double jotei = 4.0;
    double katei = 6.0;
    double takasa = 5.0;
    double menseki = (jotei + katei) * takasa / 2.0;
    System.out.println("台形の面積 = " + menseki);
    
    // お菓子の余りを求める
    int okasi = 10;
    int kodomo = 3;
    int amari = okasi % kodomo;
    System.out.println("お菓子の余り = " + amari);
    
    // 残金の計算をする
    int zankin = 100000;
    int nyukin = 200000;
    zankin += nyukin;
    System.out.println("入金後の残金 = " + zankin);
  }
}