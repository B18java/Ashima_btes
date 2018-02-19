package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Figure
{
	double dim1;
	abstract void findarea() throws IOException;
	abstract void findperimeter() throws IOException;
}

class Circle extends Figure
{
	Circle() throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of Circle");
		dim1=Double.parseDouble(br.readLine());
	}
	void findarea() 
	{
		
		System.out.println("Area of the circle is"+3.14*dim1*dim1);
	}
	void findperimeter() 
	{
		
		System.out.println("Perimeter of circle is "+2*3.14*dim1);
	}
       public String toString()
	{
		System.out.println("Overriden toString method in circle");
		return null;
		}
}
class Rect extends Figure
{
	double dim2;
	Rect() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length and breadth of Rectangle");
		dim1=Double.parseDouble(br.readLine());
		dim2=Double.parseDouble(br.readLine());
	}
	void findarea() 
	{
		
		System.out.println("Area of the rect is "+dim1*dim2);
	}
	void findperimeter() 
	{
	
		System.out.println("Perimeter of the rect is "+2*dim2*dim1);
	}
       public String toString()
	{
		System.out.println("Overriden toString method in rect class");
		return null;
		}
}

class Triangle extends Figure

{
	double dim2,dim3;
	Triangle() throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the three sides of triangle");
	dim1=Double.parseDouble(br.readLine());
	dim2=Double.parseDouble(br.readLine());
	dim3=Double.parseDouble(br.readLine());
	}
	void findarea() 
	{
		double s=dim1+dim2+dim3/2;
		double area=Math.sqrt(s*(s-dim1)*(s-dim2)*(s-dim3));
System.out.println("Area of the tiangle is "+area);
	}
	void findperimeter() 
	{
		
		System.out.println("Perimeter of the rect is "+dim1+dim2+dim3);
	}
       public String toString()
	{
		System.out.println("Overriden toString method in tirangle class");
		return null;

	}
}
public class Shapes {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	Figure[] fig1=new Figure[6];
	
	for(int i=0;i<2;i++)
	{
		fig1[i]=new Circle();
		fig1[i].findarea();
		fig1[i].findperimeter();
		fig1[i].toString();
		
	}
	for(int i=2;i<4;i++)
	{
		fig1[i]=new Rect();
		fig1[i].findarea();
		fig1[i].findperimeter();
		fig1[i].toString();
		
	}
	for(int i=4;i<6;i++)
	{
		fig1[i]=new Triangle();
		fig1[i].findarea();
		fig1[i].findperimeter();
		fig1[i].toString();
		
	}
	

	}

}
