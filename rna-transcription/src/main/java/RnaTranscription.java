class RnaTranscription {
    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
           char ch = dnaStrand.charAt(i);
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
