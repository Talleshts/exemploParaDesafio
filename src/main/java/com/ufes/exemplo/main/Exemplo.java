package com.ufes.exemplo.main;


import com.mycompany.desafioswitchbindingdata.databinding.DataBinding;
import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.presenter.PessoaPresenter;
import com.ufes.exemplo.view.PessoaView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class Exemplo {

    public static void main(String[] args) {
        // Exemplo de one-way data binding
        System.out.println("Exemplo de one-way data binding:");
        Pessoa modelOneWay = new Pessoa("Pedro");
        PessoaView viewOneWay = new PessoaView("Talles");
        PessoaPresenter presenterOneWay = new PessoaPresenter(modelOneWay, viewOneWay);
        DataBinding oneWayBinding = new DataBinding(modelOneWay, viewOneWay);
        oneWayBinding.configureOneWayBinding(false);
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getField().getText());

        viewOneWay.getField().setText("Eduardo");
        presenterOneWay.updateModel(); // Atualiza o modelo
        System.out.println("Setting value: Eduardo");
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getField().getText());

        viewOneWay.getField().setText("teste");
        presenterOneWay.updateModel(); // Atualiza o modelo
        System.out.println("Setting value: teste");
        System.out.println("Valores(Model - View): " + modelOneWay.getNome() + " - " + viewOneWay.getField().getText());

        // Exemplo de two-way data binding
        System.out.println("\nExemplo de two-way data binding:");
        Pessoa modelTwoWay = new Pessoa("Talles");
        PessoaView viewTwoWay = new PessoaView("Talles");
        PessoaPresenter presenterTwoWay = new PessoaPresenter(modelTwoWay, viewTwoWay);
        DataBinding twoWayBinding = new DataBinding(modelTwoWay, viewTwoWay);
        twoWayBinding.configureTwoWayBinding();

        System.out.println("Valores(Model - View): " + modelTwoWay.getNome() + " - " + viewTwoWay.getField().getText());

        modelTwoWay.setNome("Eduardo");
        presenterTwoWay.updateView(); // Atualiza a view
        System.out.println("Setting value: Eduardo");
        System.out.println("Valores(Model - View): " + modelTwoWay.getNome() + " - " + viewTwoWay.getField().getText());

        viewTwoWay.getField().setText("teste");
        presenterTwoWay.updateModel(); // Atualiza o modelo
        System.out.println("Setting value: teste");
        System.out.println("Valores(Model - View): " + modelTwoWay.getNome() + " - " + viewTwoWay.getField().getText());
    }
}
