// Category, Mesagge, Reservation, Client, Costume
// 1. Modelo o Entidad
// 2. Interfaces
// 3. Repositorio
// 4. Servicios
// 5. Controlador o Web

package grupo25.reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"grupo25.reto3.modelo"})
public class Reto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

}
