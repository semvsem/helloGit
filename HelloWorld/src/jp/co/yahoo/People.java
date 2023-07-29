package jp.co.yahoo;

public class People {

	private int hight = 178;

	private int weight = 60;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}
	
	public void eat() {
		weight++;
		System.out.println("eat eat......");
	}

}
