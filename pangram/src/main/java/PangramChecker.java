public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        return input
                .chars()
                .filter(i -> i >= 'a' && i <= 'z')
                .distinct()
                .count() == 26;
    }
}
