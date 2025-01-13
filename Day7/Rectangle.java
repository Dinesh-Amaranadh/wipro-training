package Day7;

public class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void area(){
        System.out.println("Area of Rectangle: "+ this.length*this.width);
    }
}
