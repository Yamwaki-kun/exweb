/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.dsw.entities;

import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Arnaldo
 */

public class Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private LocalDate datanasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }
    

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }
        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Pessoas() {
    }

    public Pessoas(Long id,String nome, String email, LocalDate datanasc) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.datanasc = datanasc;
    
}}
