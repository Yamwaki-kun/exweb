/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.services;

import br.senac.tads.dsw.entities.Pessoas;
import br.senac.tads.dsw.repositories.PessoasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


/**
 *
 * @author Arnaldo
 */
@Service
public class PessoasService {
    
    @Autowired
    private PessoasRepository pr;
    
    
    public List<Pessoas> findAll() {
        
		return pr.findAll();
                
	}
    public Pessoas insertCliente(Pessoas obj) {
		     pr.save(obj);
                      
                 return obj;
	}

}
