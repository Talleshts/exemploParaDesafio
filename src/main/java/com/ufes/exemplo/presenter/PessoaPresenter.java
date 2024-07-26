/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.exemplo.presenter;

import com.mycompany.desafioswitchbindingdata.databinding.DataBinding;
import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.view.PessoaView;

/**
 *
 * @author talle
 */
public class PessoaPresenter {
    private Pessoa pessoa;
    private PessoaView view;
    private DataBinding dataBinding;

    public PessoaPresenter(Pessoa pessoa, PessoaView view) {
        this.pessoa = pessoa;
        this.view = view;
        this.dataBinding = new DataBinding(pessoa, view);
        dataBinding.configureTwoWayBinding();
    }

    public void updateModel(String novoNome) {
        pessoa.setNome(novoNome);
        dataBinding.updateModel(pessoa);
    }

    public void updateView(String novoNome) {
        view.setNomeLabel(novoNome);
        dataBinding.updateView(view);
    }
}
