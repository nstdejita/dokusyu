public class Sample141 {
  public static void main (String[] args) {
    // double型の演算結果をint型に変数に格納する
    double a = 100.0;
    double b = 3.0;
    int x = (int) (a / b);
    System.out.println("演算結果 = " + x);
    
    //int型のデータをchar型の変数に格納する
    int code = 70;
    char moji = (char)code;
    System.out.println("文字 = " + moji);
  }
}