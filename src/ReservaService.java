
import java.time.DayOfWeek;
import java.time.LocalTime;

public class ReservaService {

    public boolean horarioPermitido(
            DayOfWeek dia, LocalTime hora) {

        if (dia == DayOfWeek.SATURDAY
                || dia == DayOfWeek.SUNDAY) {
            return false;
        }

        if (dia == DayOfWeek.FRIDAY) {
            return hora.isBefore(
                    LocalTime.of(18, 0));
        }

        return true;
    }
}
