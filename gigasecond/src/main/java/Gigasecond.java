import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

class Gigasecond {

    private LocalDateTime inputDateTime;

    Gigasecond(LocalDate birthDate) {
        inputDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        inputDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return inputDateTime.plusSeconds(1000000000);
    }

}
