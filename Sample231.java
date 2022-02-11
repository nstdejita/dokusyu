// 社員を表すEmployeeクラスの定義
class Employee {
  private String name;  // 名前
  private int salary;   // 給与
  
  // フィールドの値を表示するメソッド
  public void show() {
    System.out.print("私の名前は、" + this.name + "です。");
    System.out.println("私の給与は、" + this.salary + "円です。");
  }
  
  // 引数があるコンストラクタ
  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  // 引数がないコンストラクタ
  public Employee() {
    this("未設定",0);
  }
}

// Employeeクラスをテストするクラス
public class Sample231 {
  public static void main (String[] args) {
    Employee empA = new Employee("田中一郎", 250000);
    Employee empB = new Employee();

    empA.show();
    empB.show();
  }
}