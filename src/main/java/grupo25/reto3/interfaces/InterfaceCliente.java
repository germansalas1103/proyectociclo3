package grupo25.reto3.interfaces;

import org.springframework.data.repository.CrudRepository;
import grupo25.reto3.modelo.Cliente;

public interface InterfaceCliente extends CrudRepository<Cliente, Integer> {
    
}
