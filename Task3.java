public class Task3 {
    public static String removeVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeVowels(input));
    }
}
