public class Challenge1 {
    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";

        StringBuilder reverseString = new StringBuilder(sentence);

        reverseString.reverse();

        String answer = reverseString.toString();

        System.out.println(reverseString.toString());
    }
}
