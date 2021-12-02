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

@SpringBootApplication
@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages = {"com.*"})
public class ExercicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercicioApplication.class, args);
    }

    @Autowired
    private PessoasService pessoae;

    @RequestMapping("/pessoas")
    public ModelAndView mostrar() {
        ModelAndView mv = new ModelAndView("lpessoas");
        return mv;
    }

    @RequestMapping("/pessoas/add-new")
    public ModelAndView formulario() {
        ModelAndView mv = new ModelAndView("formulario");
        return mv;
    }

    @RequestMapping("/salvar")
    public ModelAndView salvarDados(@RequestParam("nome") String nome, @RequestParam("email") String email, @RequestParam("datanasc") String datanasc) {
        System.out.println(nome);
        System.out.println(email);
        System.out.println(datanasc);
        Pessoas p = new Pessoas();
        p.setNome(nome);
        p.setEmail(email);
        p.setDatanasc(LocalDate.parse(datanasc));
        pessoae.insertCliente(p);
        ModelAndView mv = new ModelAndView("lpessoas");
        return mv;
    }

}
