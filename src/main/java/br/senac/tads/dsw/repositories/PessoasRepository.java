/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.repositories;

import br.senac.tads.dsw.entities.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Arnaldo
 */
@Repository
@Transactional
public interface PessoasRepository extends JpaRepository<Pessoas,Long>{
    
}
