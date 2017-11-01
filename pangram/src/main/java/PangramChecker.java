public class PangramChecker {

    public boolean isPangram(String input) {
        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = ALPHABET.toCharArray();
        for (char ch : alphabetArray) {
            if (notInString(ch, input)) {
                return false;
            }
        }
        return true;
    }

    public boolean notInString(char ch, String input) {
        return input.toLowerCase().indexOf(ch) < 0;
    }
}
