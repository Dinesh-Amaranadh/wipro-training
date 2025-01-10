public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit typecasting 
        int intVal = 100;
        double doubleVal = intVal;
        System.out.println("int to double: " + doubleVal);

        // Explicit typecasting)
        double doubleValue = 99.99;
        int intValue = (int) doubleValue;
        System.out.println("double to int: " + intValue);
    }
}
