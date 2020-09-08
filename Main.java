
package com.hcl2;
import java.util.Scanner;
abstract class Shape{
public abstract double calculatePerimeter();
}
class Circle extends Shape{
float radius;
  Circle(float radius){
      this.radius=radius;
  }

   public void setRadius(float radius)
{
    this.radius=radius;
}

    public float getRadius() {
        return radius;
    }
    public double calculatePerimeter()
    {
       double perimeter_of_circle= 2*3.14*radius;
       return(perimeter_of_circle);
    }
}
class Rectangle extends Shape{
    float length;
    float breadth;
    Rectangle(float length,float breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void setLength(float length)
    {
        this.length=length;
    }

    public float getLength() {
        return length;
    }
    public void setBreadth(float breadth)
    {
        this.breadth=breadth;
    }

    public float getBreadth() {
        return breadth;
    }

    public double calculatePerimeter()
    {
    double perimeter_of_rectangle=((2*length)+(2*breadth));
    return(perimeter_of_rectangle);
    }

}
 class Square extends Shape{
float side;
Square(float side)
{
    this.side=side;
}
public void setSide(float side)
{
    this.side=side;
}
public float getSide()
{
    return side;
}
public double calculatePerimeter()
{
 double perimeter_of_square=4*side;
 return(perimeter_of_square);

}
}
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
	float radius;
	float length;
	float breadth;
	float side;
    System.out.println("Enter your choice:");
    choice=input.nextInt();
    if (choice==1)
    {
        System.out.println("enter the radius of circle:");
        radius=input.nextInt();
        Shape shape=new Circle(radius);
        System.out.println("the perimeter of circle is"+shape.calculatePerimeter());
    else if(choice==2)
    {
        System.out.println("enter the length of rectangle:");
        length=input.nextInt();
        breadth=input.nextInt();
        Shape shape=new Rectangle(length,breadth);
        System.out.println("the perimeter of rectange is"+shape.calculatePerimeter());
    }
    else if(choice==3)
    {
        System.out.println("enter the side of square:");
        side=input.nextInt();

        Shape shape=new Square(side);
        System.out.println("the perimeter of square is"+shape.calculatePerimeter());
    }
    }
}
