package edu.brandeis.cs12b.example;


public class ShapesExample {
  public static void main(String[] args){
   // testOne();
    testTwo();
  }
  
  public static void testOne() {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Rectangle(18, 18);
    shapes[1] = new Triangle(30, 30, 30);
    shapes[2] = new Circle(12);
      
    for (int i = 0; i < shapes.length; i++) {
       System.out.println("area=" + shapes[i].area() +
         ", perimeter=" + shapes[i].perimeter());
    }
  }
    
  public static void testTwo() {
    Circle circ = new Circle(12.0);
    Triangle tri = new Triangle(5, 12, 13);
    printInfo(circ);
    printInfo(tri);
  }
    
  
  public static void printInfo(Shape s) {
    System.out.println("The shape: " + s);
    System.out.println("area : " + s.area());
    System.out.println("perim: " + s.perimeter());
    System.out.println();
  }
}


// A general interface for shape classes.
interface Shape {
  public double area();
  public double perimeter();
}


//Represents rectangle shapes.
class Rectangle implements Shape {
 private double width;
 private double height;
 
 // Constructs a new rectangle with the given dimensions.
 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Returns the area of this rectangle.
 public double area() {
     return width * height;
 }
 
 // Returns the perimeter of this rectangle.
 public double perimeter() {
     return 2.0 * (width + height);
 }
}

//Represents circle shapes.
class Circle implements Shape {
 private double radius;
 
 // Constructs a new circle with the given radius.
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Returns the area of this circle.
 public double area() {
     return Math.PI * radius * radius;
 }
 
 // Returns the perimeter of this circle.
 public double perimeter() {
     return 2.0 * Math.PI * radius;
 }
}


//Represents triangle shapes.
class Triangle implements Shape {
 private double a;
 private double b;
 private double c;
 
 // Constructs a new Triangle given side lengths.
 public Triangle(double a, double b, double c) {
     this.a = a;
     this.b = b;
     this.c = c;
 }
 
 // Returns this triangle's area using Heron's formula.
 public double area() {
     double s = (a + b + c) / 2.0;
     return Math.sqrt(s * (s - a) * (s - b) * (s - c));
 }

 // Returns the perimeter of this triangle.
 public double perimeter() {
     return a + b + c;
 }
}

