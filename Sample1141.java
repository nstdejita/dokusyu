public class Sample1141 {
  public static void main (String[] args) {
    int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] b;
    
    b = a;
    a[1]=9;
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i] + ", ");
    }
    System.out.println();
  }
}