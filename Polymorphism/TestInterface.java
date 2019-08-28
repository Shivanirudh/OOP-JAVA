import java.util.Scanner;
abstract class Shape{
	protected String color;
	
	public Shape(){
		color="red";
	}
	
	public Shape(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();
}

interface Common{
	abstract double getArea();
	
	abstract double getPerimeter();
}

class Circle extends Shape implements Common{
	protected double radius;
	
	public Circle(){
		radius=1.0;
	}
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public double getArea(){
		return (float)3.14*radius*radius;
	}
	
	public double getPerimeter(){
		return (float)2*3.14*radius;
	}
}

class Rectangle extends Shape implements Common{
	protected double width;
	protected double length;
	
	public Rectangle(){
		width=1.0;
		length=1.0;
	}
	
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	
	public Rectangle(double width,double length,String color){
		super(color);
		this.width=width;
		this.length=length;
	}
	
	public Rectangle(String color){
		super(color);
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width=width;
	}
	
	public double getLength(){
		return length;
	}
	
	public void setLength(){
		this.length=length;
	}
	
	public double getArea(){
		return (float)width*length;
	}
	
	public double getPerimeter(){
		return 2*(width+length);
	}
}

class Square extends Rectangle{
	protected double side;
	
	public Square(){
		side=1.0;
	}
	
	public Square(double side){
		this.side=side;
	}
	
	public Square(double side,String color){
		super(color);
		this.side=side;
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(double side){
		this.side=side;
	}
	
	public double getArea(){
		return side*side;
	}
	
	public double getPerimeter(){
		return side*4;
	}
	
}

public class TestInterface{
	public static void main(String args[]){
		String color;
		double radius;
		double width;
		double length;
		double side;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter color of Circle: ");
		color=in.nextLine();
		System.out.print("Enter radius of Circle: ");
		radius=in.nextDouble();
		in.nextLine();
		Circle c=new Circle(radius,color);	
		
		System.out.print("Enter color of Rectangle: ");
		color=in.nextLine();
		System.out.print("Enter width of Rectangle: ");
		width=in.nextDouble();
		System.out.print("Enter length of Rectangle: ");
		length=in.nextDouble();
		in.nextLine();
		Rectangle r=new Rectangle(width,length,color);
		
		System.out.print("Enter color of Square: ");
		color=in.nextLine();
		System.out.print("Enter side of Square: ");
		side=in.nextDouble();
		
		Square s=new Square(side,color);
		
		System.out.println("Area of Circle :"+c.getArea());
		System.out.println("Perimeter of Circle :"+c.getPerimeter());
		System.out.println("Area of Rectangle :"+r.getArea());
		System.out.println("Perimeter of Rectangle :"+r.getPerimeter());
		System.out.println("Area of Square :"+s.getSide()*s.getSide());
		System.out.println("Perimeter of Square :"+4*s.getSide());
	}
}

/*
Output:
Enter color of Circle: red
Enter radius of Circle: 5
Enter color of Rectangle: blue
Enter width of Rectangle: 5
Enter length of Rectangle: 6
Enter color of Square: green
Enter side of Square: 5
Area of Circle :78.50000262260437
Perimeter of Circle :31.400000000000002
Area of Rectangle :30.0
Perimeter of Rectangle :22.0
Area of Square :25.0
Perimeter of Square :20.0
*/
