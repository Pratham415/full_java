class Food{
	private String name;

	public Food(String name){
		this.name = name;
	}

	public void displayFoodInfo(){
		System.out.println("The name of Food : " + name);
	}
}
class Fruit extends Food{
	private String color;

	public Fruit(String name,String color){
		super(name);
		this.color = color;
	}

	public void displayFruitInfo(){
		super.displayFoodInfo();
		System.out.println("the color of the Fruit : "+color);
	}
}
class Citrus extends Fruit{
	private int vitaminCount;

	public Citrus(String name ,String color , int vitaminCount){
		super(name,color);
		this.vitaminCount = vitaminCount;
	} 

	public void displayOranggeInfo(){
		super.displayFruitInfo();
		System.out.println("The vitamin : "+vitaminCount);
	}
}
public class Multilevel{
	public static void main(String[] args){
		Citrus o = new Citrus("orange","orange",45);

		o.displayOranggeInfo();
	}
}