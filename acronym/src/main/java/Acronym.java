class Acronym {
    private String[] phraseArray;

    Acronym(String phrase) {
        phraseArray = phrase.toUpperCase().split(" |-");
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        for (String s : phraseArray) {
            acronym.append(s.charAt(0));
        }
        return acronym.toString();
    }

}
