public class Sample1111 {
  public static void main (String[] args) {
    // データを格納した２次元配列
    String[][] table = {
      { "0行0列", "0行1列", "0行2列", "0行3列", "0行4列" }, 
      { "1行0列", "1行1列", "1行2列" }, 
      { "2行0列", "2行1列", "2行2列", "2行3列" }, 
    };
    
    // ２次元配列のすべての要素を表示する
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        System.out.print(table[row][col] + "\t");
      }
      System.out.println();
    }
  }
}