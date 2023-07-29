package jp.co.weming;

public class Employee {
	// 名前
	String name;
	// 年齢
	int age;
	// 職務
	String designation;
	// 収入
	double salary;

	// Employee 类的构造器
	public Employee(String empname) {
		this.name = empname;
	}

	// 设置age的值
	public void empAge(int empAge) {
		age = empAge;
	}

	/* 设置designation的值 */
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}

	/* 设置salary的值 */
	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	/* 打印信息all */
	public void printEmployee() {
		System.out.print("名字:" + name + ", ");
		System.out.print("年龄:" + age + ", ");
		System.out.print("职位:" + designation + ", ");
		System.out.println("薪水:" + salary);
	}
	/* 打印信息name designation */
	public void printEmployee1() {
		System.out.print("名字:" + name + ", ");
		System.out.println("职位:" + designation + ", ");
		
	}

	// 名前を取得する
	public String getName() {
		return name;
	}

	// 名前を設定する
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
