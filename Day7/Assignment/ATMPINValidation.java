package Day7.Assignment;
import java.util.*;
public class ATMPINValidation {

    private static final String CORRECT_PIN = "1234";
    private static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        // Loop to allow up to MAX_ATTEMPTS
        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your 4-digit PIN: ");
            String inputPin = sc.nextLine();
       
            try {
                // Validate the entered PIN
                validatePin(inputPin);
                System.out.println("PIN validation successful. Access granted.");
                return; // Exit program if PIN is correct
            } catch (InvalidPinLengthException | NonNumericPinException e) {
                // Handle PIN validation exceptions
                System.out.println("Error: " + e.getMessage());
            }

            attempts++;

            if (attempts == MAX_ATTEMPTS) {
                try {
                    // Throw exception if max attempts are exceeded
                    throw new ExceededAttemptsException("Maximum attempts exceeded. Account locked.");
                } catch (ExceededAttemptsException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Please try again. Attempts remaining: " + (MAX_ATTEMPTS - attempts));
            }
        }

        sc.close();
    }
        private static void validatePin(String pin) throws InvalidPinLengthException, NonNumericPinException {
          
            if (pin.length() != 4) {
                throw new InvalidPinLengthException("PIN must be exactly 4 digits long.");
            }
    
           
            if (!pin.matches("\\d+")) {
                throw new NonNumericPinException("PIN must contain only numeric digits.");
            }
    
            if (!pin.equals(CORRECT_PIN)) {
                throw new InvalidPinLengthException("Incorrect PIN. Please try again.");
            }
        }


    
}
