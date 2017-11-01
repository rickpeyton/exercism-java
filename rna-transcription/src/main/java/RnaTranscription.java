class RnaTranscription {
    String transcribe(String dnaStrand) {
        char[] dnaArray = dnaStrand.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (Character character : dnaArray) {
           sb.append(transcribe(character));
        }
        return sb.toString();
    }

    char transcribe(char subString) {
        switch (subString) {
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }
}
