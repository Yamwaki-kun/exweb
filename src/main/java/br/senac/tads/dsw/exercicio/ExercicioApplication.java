package br.senac.tads.dsw.exercicio;

import br.senac.tads.dsw.entities.Pessoas;
import br.senac.tads.dsw.services.PessoasService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages="br.senac.tads.dsw.resources")
public class ExercicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercicioApplication.class, args);
    }

    

}
