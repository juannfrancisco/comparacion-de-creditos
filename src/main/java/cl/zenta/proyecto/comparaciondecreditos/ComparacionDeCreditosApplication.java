package cl.zenta.proyecto.comparaciondecreditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //Habilitar la herramienta de swagger para probar los servicios rest
public class ComparacionDeCreditosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparacionDeCreditosApplication.class, args);
	}

}
