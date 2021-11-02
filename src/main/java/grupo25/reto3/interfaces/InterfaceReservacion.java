package grupo25.reto3.interfaces;

import org.springframework.data.repository.CrudRepository;
import grupo25.reto3.modelo.Reservacion;

public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer> {
    
}
