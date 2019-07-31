class Base{
	/*Base(){ System.out.println("Base Noarg");}*/
	Base(int a){System.out.println("Base Para"+a);}
}

class Derived extends Base{
	Derived(){System.out.println("Derived Noarg");}
	Derived(int b){System.out.println("Derived Para"+b);}
}

public class BaseDerived{
	public static void main(String args[]){
		Base  b=new Base();
		Derived d=new Derived(20);
	}
}
