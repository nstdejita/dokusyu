public class Sample171 {
  public static void main (String[] args) {
    int a = 60, b= 84;
    
    while (a != b) {
      if (a > b) {
        a -= b;
      }
      else {
        b -= a;
      }
    }
    System.out.println("最大公約数 = " + a);
  }
}