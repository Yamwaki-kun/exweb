package br.senac.tads.dsw.exercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Configuration
@ComponentScan(basePackages = "br.senac.tads.dsw.resources")
@ComponentScan(basePackages = "br.senac.tads.dsw.services")
@ComponentScan(basePackages = "br.senac.tads.dsw.entities")
@EnableJpaRepositories(basePackages = {"br.senac.tads.dsw.repositories"})
@EntityScan("br.senac.tads.dsw.entities")

public class ExercicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercicioApplication.class, args);
    }

}
