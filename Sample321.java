public class Sample321 {
  public static void main (String[] args) {
    String s1 = "apple";
    String s2 = "orange";
    
    // 文字列が等しいかどうか調べる
    if (s1.equals(s2)) {
      System.out.println("等しい");
    }
    else {
      System.out.println("等しくない");
    }
    
    // 文字列の大きさを辞書順で比較する
    int ans = s1.compareTo(s2);
    if (ans == 0) {
      System.out.println("等しい");
    }
    else if (ans > 0) {
      System.out.println(s1 + "の方が大きい");
    }
    else {
      System.out.println(s1 + "の方が小さい");
    }
  }
}