class RnaTranscription {
    String transcribe(String dnaStrand) {
        char[] dnaArray = dnaStrand.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : dnaArray) {
           sb.append(transcribe(ch));
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
