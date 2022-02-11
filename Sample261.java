// 社員を表すEmployeeクラスの定義
class Employee {
  private String name;  // 名前
  private int salary;   // 給与
  
  // コンストラクタ
  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  // 名前を書き込むメソッド
  public void setName(String name) {
    this.name = name;
  }

  // 名前を読み出すメソッド
  public String getName() {
    return this.name;
  }

  // 給与を書き込むメソッド
  public void setSalary(int salary) {
    // マイナスの給与は受け付けない
    if (salary >= 0) {
      this.salary = salary;
    }
  }

  // 給与を読み出すメソッド
  public int getSalary() {
    return this.salary;
  }
}

// Employeeクラスをテストするクラス
public class Sample261 {
  public static void main (String[] args) {
    // Employeeクラスのインスタンスを生成する
    Employee emp = new Employee("未設定",0);
    
    // セッタを使ってフィールドに書き込む
    emp.setName("田中一郎");
    emp.setSalary(250000);
    
    // ゲッタを使ってフィールドから読み出す
    System.out.println("氏名 = " + emp.getName());
    System.out.println("給与 = " + emp.getSalary());
    
    // フィールドに不適切な値を書き込む
    emp.setSalary(-100000);
    
    // フィールドの値を表示する（不適切な値は書き込まれていない)
    System.out.println("給与 = " + emp.getSalary());
    
  }
}