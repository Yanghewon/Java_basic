package ConceptStudy;

public class MainClass {

	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Grandeur myCar2 = new Grandeur();
		myCar2.color = "yellow";
		myCar2.gear = "auto";
		myCar2.price = 500;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "green";
		myBicycle.price = 50;
		
		myBicycle.info();
		
		Bicycle2 myBicycle2 = new Bicycle2("red", 100);
		myBicycle.info();
		
		myBicycle.color = "yellow"; // 속성 변화 가능
		myBicycle.info();
		
		

	}

}
