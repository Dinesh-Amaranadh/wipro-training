package Day7;

public class Car {
    String brand = "Audi";
    String model = "nano";
    int year =2024;

    public void display(){
        System.out.println("I have a car of brand: "+this.brand+" of model: "+this.model+" with year of manufacture: "+this.year);
    }

public static void main(String [] args){
    Car car = new Car();
    car.display();
}
}
