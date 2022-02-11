class MyClass extends Thread {
  private String name;
  
  // マルチスレッドで実行されるメソッド
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println(this.name + ":" + i);
        Thread.sleep(100);
      }
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
  
  public MyClass(String name) {
    this.name = name;
  }
}

// ２つのスレッドを起動するクラス
public class Sample341 {
  public static void main (String[] args) {
    // インスタンスを２つ生成する
    MyClass a = new MyClass("A");
    MyClass b = new MyClass("B");
    
    // ２つのスレッドの実行を開始する
    a.start();
    b.start();
  }
}