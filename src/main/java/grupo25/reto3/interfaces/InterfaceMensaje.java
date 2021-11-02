package grupo25.reto3.interfaces;

import org.springframework.data.repository.CrudRepository;
import grupo25.reto3.modelo.Mensaje;

public interface InterfaceMensaje extends CrudRepository<Mensaje, Integer> {
    
}
