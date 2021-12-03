/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.resources;

import br.senac.tads.dsw.entities.Pessoas;
import br.senac.tads.dsw.services.PessoasService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author Arnaldo
 */
@RestController
@RequestMapping(value = "/pessoas")

public class PessoasController {
    @Autowired
    private PessoasService pessoae;

    @RequestMapping()
    public ModelAndView mostrar() {
        ModelAndView mv = new ModelAndView("lpessoas");
        return mv;
    }

    @RequestMapping("/add-new")
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
