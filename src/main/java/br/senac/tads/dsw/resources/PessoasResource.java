/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.resources;

import br.senac.tads.dsw.entities.Pessoas;
import br.senac.tads.dsw.services.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Arnaldo
 */
@RestController
@RequestMapping(value = "/pessoas")
public class PessoasResource {
    @Autowired
    private PessoasService service;
            
    @GetMapping
    public ModelAndView cadastrar() {
        System.out.println("Minha rola");
        ModelAndView mv = new ModelAndView("lpessoas");
        return mv;
        

    }

    @PostMapping(value = "/cadastrar")
    public ModelAndView salvardados(){
        ModelAndView mv = new ModelAndView("formulario");
        return mv;
    }
    @GetMapping(value ="/add-new")
    public ModelAndView verForm(){
        ModelAndView mv = new ModelAndView("formulario");
        return mv;
    }
}
