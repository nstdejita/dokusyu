public class Sample131 {
  public static void main (String[] args) {
    String s1, s2, s3;
    
    // 文字列を格納する
    s1 = "ABCDEFG";
    s2 = "あいうえお";
    
    // 文字列を連結する
    s3 = s1 + s2;
    System.out.println(s3);
    
    // 文字列の長さを表示する
    System.out.println("s3の長さ = " + s3.length());
    
    // 文字列の中から１文字を取得する
    System.out.println("s3の８番目の文字 = " + s3.charAt(8));
  }
} 