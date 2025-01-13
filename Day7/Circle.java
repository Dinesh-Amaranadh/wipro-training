package Day7;

public class Circle  extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of circle : "+ Math.PI*radius*radius);
    }
}
