class A{
	private  String modal , brand ;
	private  int manufacturingyear;

	public A(){
		modal = brand = null;
		manufacturingyear = 0;
	}

	public A(String brand,String modal,int manufacturingyear){
		this.brand = brand;
		this.modal = modal;
		this.manufacturingyear = manufacturingyear;
	}

	public A(A obj){
		this.brand = obj.brand;
		this.modal = obj.modal;
		this.manufacturingyear = obj.manufacturingyear;
	}

	public void getDetails(){
		System.out.println("The A brand : " + brand);
		System.out.println("The A modal : " + modal);
		System.out.println("The A manufacturingyear : " + manufacturingyear);
	}

}

public class Constructor{
	public static void main(String[] args){
		A c = new A();
		A c1 = new A("maruti","Auto 800",2005);
		A c2 = new A(c1);

		c.getDetails();
		
		c1.getDetails();

		c2.getDetails();
	}
}