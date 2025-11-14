package HernandezServicios.producto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productoOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Microservicio Producto")
                        .version("1.0.0")
                        .description("APIs para la gestión de productos"))
                .addServersItem(new Server().url("http://localhost:86").description("Producto local"));
    }
}
