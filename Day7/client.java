package Day7;

public class client {
    public static void main(String[] args) {
        // Person person = new Person("Dinesh",25 );
        // person.displayDetails();
        // Student student = new Student("Amaranadh",25,"B");
        // student.displayDetails();


        Shape shape = new Shape();
        shape.area();
        Circle circle = new Circle(7);
        circle.area();

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.area();
        Shape shape2 = new Circle(7);
        shape2.area();

    }
}
