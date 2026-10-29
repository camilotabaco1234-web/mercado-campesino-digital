
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class ReservaServiceTest {

    private final ReservaService servicio =
            new ReservaService();

    @Test
    void permiteReservaDeLunes() {
        assertTrue(servicio.horarioPermitido(
                DayOfWeek.MONDAY,
                LocalTime.of(10, 0)));
    }

    @Test
    void permiteViernesAntesDeLasSeis() {
        assertTrue(servicio.horarioPermitido(
                DayOfWeek.FRIDAY,
                LocalTime.of(17, 0)));
    }

    @Test
    void rechazaViernesALasSeis() {
        assertFalse(servicio.horarioPermitido(
                DayOfWeek.FRIDAY,
                LocalTime.of(18, 0)));
    }

    @Test
    void rechazaReservasLosDomingos() {
        assertFalse(servicio.horarioPermitido(
                DayOfWeek.SUNDAY,
                LocalTime.of(10, 0)));
    }
}
