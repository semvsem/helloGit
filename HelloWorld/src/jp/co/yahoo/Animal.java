package jp.co.yahoo;

public class Animal {
	
	int leg = 4;
	
	String name = "bigBare";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		System.out.println("动物可以移动");
	}

	public void run() {
		System.out.println("动物可以pao");
	}
}
