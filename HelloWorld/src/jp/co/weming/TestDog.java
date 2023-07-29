package jp.co.weming;

import jp.co.yahoo.Animal;
import jp.co.yahoo.People;

class Dog extends Animal {
	public void move() {
		System.out.println("狗可以跑和走");
	}
}

public class TestDog {
	public static void main(String args[]) {
		Animal a = new Animal(); // Animal 对象
		
//		System.out.println(a.getName());
//		a.setName("littleCat");
//		System.out.println(a.getName());
		
		People zhang = new People();
		System.out.println(zhang.getHight());
		System.out.println(zhang.getWeight());
		zhang.setHight(170);
		zhang.setWeight(50);
		System.out.println(zhang.getHight());
		System.out.println(zhang.getWeight());
		zhang.eat();
		System.out.println(zhang.getWeight());
	}
}