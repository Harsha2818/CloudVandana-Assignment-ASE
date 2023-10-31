import java.util.*;

public class Pangram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check for pangram: ");
        String input = scanner.nextLine();

        boolean isPangram = checkIfPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size() == 26 && containsAllLetters(set);
    }

    public static boolean containsAllLetters(Set<Character> set) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
