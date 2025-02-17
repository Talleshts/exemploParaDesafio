/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.exemplo.presenter;

import com.mycompany.desafioswitchbindingdata.databinding.DataBinding;
import com.mycompany.desafioswitchbindingdata.observer.Observer;
import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.view.PessoaView;

/**
 *
 * @author talle
 */
public class PessoaPresenter implements Observer {
    private Pessoa pessoa;
    private PessoaView view;

    public PessoaPresenter(Pessoa pessoa, PessoaView view) {
        this.pessoa = pessoa;
        this.view = view;
        this.pessoa.addObserver(this);
        updateView();

        view.getButton().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pessoa.setNome(view.getField().getText());
            }
        });
    }

    @Override
    public void update(Object objeto) {
        if (objeto instanceof Pessoa) {
            Pessoa pessoaAtualizada = (Pessoa) objeto;
            view.setNomeLabel(pessoaAtualizada.getNome());
            view.getField().setText(pessoaAtualizada.getNome());
        }
    }

    public void updateView() {
        view.setNomeLabel(pessoa.getNome());
        view.getField().setText(pessoa.getNome());
    }

    public void updateModel() {
        pessoa.setNome(view.getField().getText());
    }
}
