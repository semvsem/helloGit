package jp.co.weming;

public class EmployeeTest {

	public static void main(String[] args) {
		/* 使用构造器创建两个对象 */
		Employee empOne = new Employee("RUNOOB1");
		Employee empTwo = new Employee("RUNOOB2");
		Employee empThree = new Employee("li");
		Employee empFour = new Employee("zhao");

		// 调用这两个对象的成员方法
		empOne.empAge(26);
		empOne.empDesignation("高级程序员");
		empOne.empSalary(1000);
		empOne.printEmployee();

		empTwo.empAge(21);
		empTwo.empDesignation("菜鸟程序员");
		empTwo.empSalary(500);
		empTwo.printEmployee();

		empOne.setName("song");
		empOne.printEmployee();

		empTwo.setName("zhang");
		empTwo.setSalary(800);
		empTwo.printEmployee();

		empOne.printEmployee1();

		empThree.empDesignation("菜鸟程序员");
		empThree.printEmployee1();

		System.out.println(
				empOne.getName() + "," + empTwo.getName() + "," + empThree.getName() + "," + empFour.getName());

		int[] arrayInt = { 1, 3, 5, 7, 9 };
		String[] arraySring = { "a", "b", "c", "d", "e" };

//		for (int i = 0; i < 5; i++) {
//			System.out.print(arrayInt[i] + arraySring[i]);
//		}

		Employee empArray[] = new Employee[5];

		empArray[0] = new Employee("Emp" + 1);
		empArray[1] = new Employee("Emp" + 2);
		empArray[2] = new Employee("Emp" + 3);
		empArray[3] = new Employee("Emp" + 4);
		empArray[4] = new Employee("Emp" + 5);
		
		for (int i = 0; i < empArray.length; i++) {
			Employee employee = empArray[i];
			
			employee.printEmployee();

		}
		
		empArray[0].empAge(26);
		empArray[0].empDesignation("高级程序员");
		empArray[0].empSalary(1000);

		empArray[1].empAge(21);
		empArray[1].empDesignation("菜鸟程序员");
		empArray[1].empSalary(500);
		for (int i = 0; i < empArray.length; i++) {
			Employee employee = empArray[i];
			employee.printEmployee();
			
		}

	}
}
