// 社員を表すEmployeeクラスの定義
class Employee {
  private static int number = 0;  // 社員数   　staticがあるのでクラスメンバ
  private String name;            // 名前       staticがないのでインスタンスメンバ
  private int salary;             // 給与       staticがないのでインスタンスメンバ
  
  // 名前と給与の値を表示するインスタンスメソッド
  public void show() {
    System.out.print("私の名前は、" + this.name + "です。");
    System.out.println("私の給与は、" + this.salary + "円です。");
  }
  
  // コンストラクタ
  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
    Employee.number++;
  }

  // 社員数を表示するクラスメソッド   staticがあるのでクラスメンバ
  public static void showNumber() {
    System.out.println("現在の社員数は = " + Employee.number + "人です。"); 
  }
}

// Employeeクラスをテストするクラス
public class Sample241 {
  public static void main (String[] args) {
    // １つ目のインスタンスを生成し、社員数を表示する
    Employee tanaka = new Employee("田中一郎", 250000);
    Employee.showNumber();
    tanaka.show();
    
    // ２つ目のインスタンスを生成し、社員数を表示する
    Employee suzuki = new Employee("鈴木花子", 300000);
    Employee.showNumber();
    suzuki.show();
  }
}