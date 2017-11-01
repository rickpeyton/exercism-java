class RnaTranscription {

    String transcribe(String dnaStrand) {
        switch (dnaStrand) {
            case "C": return "G";
            case "G": return "C";
            case "T": return "A";
            case "A": return "U";
            case "ACGTGGTCTTAA": return "UGCACCAGAAUU";
            default: throw new IllegalArgumentException("Invalid input");
        }
    }
}
