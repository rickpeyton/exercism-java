import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Acronym {
    private static Pattern P = Pattern.compile(" |-");
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase.toUpperCase();
    }

    String get() {
        return P.splitAsStream(this.phrase)
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
    }

}
