// 任意のデータ型で点を表すクラス
class Point<T> {
  private T x;    // X座標
  private T y;    // Y座標
  
  // toStringメソッドをオーバーライドする
  public String toString() {
    return "x = " + this.x + ", y = " + this.y;
  }
  
  // コンストラクタ
  public Point(T x, T y) {
    this.x = x;
    this.y = y;
  }
}

// Pointクラスをテストするクラス
public class Sample2131 {
  public static void main (String[] args) {
    // Integer型のPointクラスのインスタンスを生成する
    // int型の10, 20がIntegerクラスにボクシングされる
    Point <Integer> p1 = new Point<Integer>(10, 20);
    System.out.println(p1);

    // Double型のPointクラスのインスタンスを生成する
    // double型の1.23, 4.56がDoubleクラスにボクシングされる
    Point <Double> p2 = new Point<Double>(1.23, 4.56);
    System.out.println(p2);
  }
}