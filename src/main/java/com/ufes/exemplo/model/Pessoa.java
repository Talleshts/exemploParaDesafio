/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.exemplo.model;

import com.mycompany.desafioswitchbindingdata.observer.Observavel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author talle
 */
public class Pessoa extends Observavel {
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notificaObservers(this);
    }
}
