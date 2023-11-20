abstract class Shape {
 public abstract void draw();
}

class Line extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Line");
 }
}

class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

class Cube extends Shape 
{
 @Override
 public void draw() 
{
     System.out.println("Drawing a Cube");
 }
}

public class Cubelinerect 
{
 public static void main(String[] args) 
  {
     Line line = new Line();
     Rectangle rectangle = new Rectangle();
     Cube cube = new Cube();

     drawShape(line);
     drawShape(rectangle);
     drawShape(cube);
 }

 public static void drawShape(Shape shape) 
{
     shape.draw();
 }
}

abstract class Shape 
{
	public abstract void draw();
}


class Line extends Shape 
{
 @Override
 public void draw() 
   {
     System.out.println("Drawing a Line");
   }
}

class Rectangle extends Shape 
{
  @Override
 public void draw() 
  {
     System.out.println("Drawing a Rectangle");
  }
}

class Cube extends Shape 
{
 @Override
 public void draw() 
 {
     System.out.println("Drawing a Cube");
 }
}


public class Cubelinerect 
{
 public static void main(String[] args) 
  {

     Line line = new Line();
     Rectangle rectangle = new Rectangle();
     Cube cube = new Cube();

     drawShape(line);
     drawShape(rectangle);
     drawShape(cube);
  }

   public static void drawShape(Shape shape)
   {
     shape.draw();
   }
}