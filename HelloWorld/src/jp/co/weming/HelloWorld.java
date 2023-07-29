package jp.co.weming;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("Hello World!!");

		String name = "earth";
		//name = "song";
		int number = 20;
		
		
		
		
		for (int i = 1; i < 10; i++) {

//			if (a <= 5) {
//				System.out.println("你好,small:" + a * a);
//			} else {
//				System.out.println("你好,big  :" + a * a);
//			}

			for (int j = 1; j < 10; j++) {

				if (j<=i) {
					System.out.print(i + "*" + j + "=" + i * j + "\t");
				}
				

			}
			System.out.println("");

		}

	}

}
