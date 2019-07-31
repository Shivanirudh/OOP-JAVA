interface LandAnimal{
	int age=100;
	String name=new String("Shashu");
	void show();
}

interface WaterAnimal{
	int age=1500;
	String name=new String("5 Brothers, Saavi mother");
	void show();
}

class Frog implements LandAnimal,WaterAnimal{
	public void show(){
		System.out.println(LandAnimal.name+" <3 "+WaterAnimal.name);
	}
}

public class Interface{
	public static void main(String args[]){
		Frog f=new Frog();
		f.show();
	}
}
