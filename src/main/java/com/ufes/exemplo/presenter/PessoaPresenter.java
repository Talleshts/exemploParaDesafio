/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.exemplo.presenter;

import com.mycompany.desafioswitchbindingdata.databinding.DataBinding;
import com.ufes.exemplo.model.IObserver;
import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.view.PessoaView;

/**
 *
 * @author talle
 */
public class PessoaPresenter implements IObserver {
    private Pessoa pessoa;
    private PessoaView view;
    private DataBinding dataBinding;

    public PessoaPresenter(Pessoa pessoa, PessoaView view) {
        this.pessoa = pessoa;
        this.view = view;
        this.dataBinding = new DataBinding(pessoa, view);
        dataBinding.configureTwoWayBinding();
        pessoa.addObserver(this);
        view.getButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateModel(view.getField().getText());
                view.setNomeLabel(view.getField().getText());
            }
        });
    }

    public String getNome() {
        return pessoa.getNome();
    }

    public void updateModel(String novoNome) {
        dataBinding.updateModel(pessoa);
    }

    public void updateView(String novoNome) {
        dataBinding.updateView(view);
    }

    @Override
    public void update(Pessoa pessoa) {
        updateModel(getNome());
        updateView(getNome());
    }
}
