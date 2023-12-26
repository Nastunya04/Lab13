package task1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface User {
    String getEmail();
    String getCountry();
    LocalDate getLastActiveDate();
}
