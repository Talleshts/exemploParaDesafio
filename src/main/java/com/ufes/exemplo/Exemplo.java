/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.exemplo;

import com.mycompany.desafioswitchbindingdata.databinding.DataBinding;
import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.presenter.PessoaPresenter;
import com.ufes.exemplo.view.PessoaView;

/**
 *
 * @author talle
 */
public class Exemplo {

    public static void main(String[] args) {
        // Exemplo de one-way data binding
        System.out.println("Exemplo de one-way data binding:");
        Pessoa modelOneWay = new Pessoa("Valor inicial");
        PessoaView viewOneWay = new PessoaView();
        DataBinding oneWayBinding = new DataBinding(modelOneWay, viewOneWay);
        oneWayBinding.configureOneWayBinding(true);
        modelOneWay.setNome("Novo valor");
        System.out.println("Valor da view: " + viewOneWay.getNomeLabel());

        // Exemplo de two-way data binding
        System.out.println("\nExemplo de two-way data binding:");
        Pessoa modelTwoWay = new Pessoa("Valor inicial");
        PessoaView viewTwoWay = new PessoaView();
        DataBinding twoWayBinding = new DataBinding(modelTwoWay, viewTwoWay);
        twoWayBinding.configureTwoWayBinding();
        modelTwoWay.setNome("Novo valor");
        System.out.println("Valor da view: " + viewTwoWay.getNomeLabel());
        viewTwoWay.setNomeLabel("Valor atualizado");
        System.out.println("Valor da model: " + modelTwoWay.getNome());

    }
}
