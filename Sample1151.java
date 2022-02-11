public class Sample1151 {
  public static void main (String[] args) {
    int a, b, ans;
    
    try {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      ans = a / b;
      System.out.println(ans);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("2つのパラメーターを指定してください！");
    }
    catch (NumberFormatException e) {
      System.out.println("2つの整数を指定してください！");
    }
    catch (ArithmeticException e) {
      System.out.println("ゼロ除算が行われました！");
    }
    catch (Exception e) {
      System.out.println("その他の例外が発生しました！");
    }
  }
}