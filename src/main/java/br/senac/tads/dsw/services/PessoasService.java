/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.services;

import br.senac.tads.dsw.entities.Pessoas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Arnaldo
 */
@Service

public class PessoasService {
    @Autowired
    private PessoasService pessoae;
    
    public List<Pessoas> findAll() {
        
		return pessoae.findAll();
	}
    public Pessoas insertCliente(Pessoas obj) {
        System.out.println("chegamo até aqui");
		 pessoae.insertCliente(obj);
                 return obj;
	}

}
