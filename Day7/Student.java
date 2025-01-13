package Day7;

class Student extends Person {
    String grade;


    Student(String name,int age,String grade){
        super(name, age);
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("My name is "+ name+" and I am "+age+ " years old. I got "+grade+" out of 10 points.");
    }

    
}
