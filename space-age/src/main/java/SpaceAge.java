class SpaceAge {

    private double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double calculate(double multiplier) {
        return (this.seconds / (multiplier * 24 * 60 * 60));
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        double earthRevolutionDays = 365.26;
        return calculate(earthRevolutionDays);
    }

    double onMercury() {
        double mercuryRevolutionDays = 87.97;
        return calculate(mercuryRevolutionDays);
    }

    double onVenus() {
        double venusRevolutionDays = 224.7;
        return calculate(venusRevolutionDays);
    }

    double onMars() {
        double marsRevolutionDays = 686.93;
        return calculate(marsRevolutionDays);
    }

    double onJupiter() {
        double jupiterRevolutionDays = 4_333.505212762;
        return calculate(jupiterRevolutionDays);
    }

    double onSaturn() {
        double saturnRevolutionDays = 10_764.339255309;
        return calculate(saturnRevolutionDays);
    }

    double onUranus() {
        double uranusRevolutionDays = 30_696.270904227;
        return calculate(uranusRevolutionDays);
    }

    double onNeptune() {
        double neptuneRevolutionDays = 60_212.337606327;
        return calculate(neptuneRevolutionDays);
    }

}
