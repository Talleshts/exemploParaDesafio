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
        Pessoa modelOneWay = new Pessoa("Talles");
        PessoaPresenter viewOneWay = new PessoaPresenter(modelOneWay, new PessoaView("Talles"));
        DataBinding oneWayBinding = new DataBinding(modelOneWay, viewOneWay);
        oneWayBinding.configureOneWayBinding(true);
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());

        viewOneWay.updateModel("Eduardo");
        System.out.println("Setting value: Eduardo");
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());

        viewOneWay.updateView("teste");
        System.out.println("Setting value: teste");
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());

        // Exemplo de two-way data binding
        // System.out.println("\nExemplo de two-way data binding:");
        // Pessoa modelTwoWay = new Pessoa("Talles");
        // PessoaPresenter viewTwoWay = new PessoaPresenter(modelTwoWay, new PessoaView("Talles"));
        // DataBinding twoWayBinding = new DataBinding(modelTwoWay, viewTwoWay);
        // twoWayBinding.configureTwoWayBinding();

        //  System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());

        // modelTwoWay.setNome("Eduardo");
        
        //  System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());

        // viewTwoWay.updateView("teste");

        //  System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getNome());
    }
}
