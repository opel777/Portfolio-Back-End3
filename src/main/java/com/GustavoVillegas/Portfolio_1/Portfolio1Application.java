package com.GustavoVillegas.Portfolio_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Portfolio1Application {

    
	public static void main(String[] args) {
		SpringApplication.run(Portfolio1Application.class, args);
	}
        //configurando el cors para la conexion con angular
            @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("https://gustavovillegas-portfolio.netlify.app","http://localhost:4200","https://gustavo-villegas-portfolio.web.app/").allowedMethods("*").allowedHeaders("*");
            }
        };
    } 

}
/* la carpeta gitignore no debe tener la carpeta target ignorada*/
