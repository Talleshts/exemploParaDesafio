/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.exemplo;

import com.ufes.exemplo.model.Pessoa;
import com.ufes.exemplo.presenter.PessoaPresenter;
import com.ufes.exemplo.view.PessoaView;

/**
 *
 * @author talle
 */
public class Exemplo {

    public static void main(String[] args) {
                Pessoa pessoa = new Pessoa("João");
                PessoaView view = new PessoaView(pessoa.getNome());
                PessoaPresenter presenter = new PessoaPresenter(pessoa, view);

                presenter.updateModel("Maria");
    }
}
