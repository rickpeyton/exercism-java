import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime inputDateTime;

    Gigasecond(LocalDate birthDate) {
        inputDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        inputDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        long GIGASECOND = 1_000_000_000;
        return inputDateTime.plusSeconds(GIGASECOND);
    }

}
