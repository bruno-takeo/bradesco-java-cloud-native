package me.dio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permite CORS em todos os endpoints
                .allowedOrigins("*")  // Permite todas as origens (substitua por origens específicas, se necessário)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")  // Permite os métodos desejados
                .allowedHeaders("*")  // Permite todos os cabeçalhos
                .allowCredentials(true);
    }
}
