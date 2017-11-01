import java.util.logging.Logger;

public class PangramChecker {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetArray = alphabet.toCharArray();
        for (char ch : alphabetArray) {
            if (input.toLowerCase().indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }

}
