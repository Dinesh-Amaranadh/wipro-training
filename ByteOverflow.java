public class ByteOverflow {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Initial byte value: " + b);
        b+=1;
        System.out.println("overflow: " + b);
    }
}
