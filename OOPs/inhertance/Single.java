class Train{
	private String trainNumber;
	private int numberofcoaches;

	public Train(){
		trainNumber = "";
		numberofcoaches = 0;	
	}

	public Train(String trainNumber,int numberofcoaches){
		this.trainNumber = trainNumber;
		this.numberofcoaches = numberofcoaches;
	}
	public void print(){
		System.out.println("The trainNumber : " + trainNumber);
		System.out.println("The numberofcoaches : " + numberofcoaches);
	}
	public void start(){
		System.out.println("Train engine is starting ");
	}
	public void end(){
		System.out.println("Train engine is stoped !!");
	}
}
class highSpeedTrain extends Train{
	private int maxspeed;

	public highSpeedTrain(String trainNumber,int numberofcoaches,int  maxspeed){
		super(trainNumber,numberofcoaches);
		this.maxspeed = maxspeed;
	}

	public void accelerate(){
		super.start();
		System.out.println("The maxspeed of the train is : " + maxspeed);
		super.end();
	}
}
public class Single{
	public static void main(String[] args){
		highSpeedTrain h = new highSpeedTrain("203420",20,190);
		h.accelerate();
		h.print();


	}
}