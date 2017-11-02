public class Hamming {
    private char[] leftStrandArr;
    private char[] rightStrandArr;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        leftStrandArr = leftStrand.toCharArray();
        rightStrandArr = rightStrand.toCharArray();
        getHammingDistance();
    }

    int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < leftStrandArr.length; i++) {
            if (leftStrandArr[i] != rightStrandArr[i]) {
                distance++;
            }
        }
        return distance;
    }

}
