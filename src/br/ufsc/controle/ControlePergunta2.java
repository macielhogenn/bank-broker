/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.controle;

import br.ufsc.visao.FrmPergunta1;
import br.ufsc.visao.FrmPergunta2;

/**
 *
 * @author admin
 */
public class ControlePergunta2 {

    FrmPergunta2 frm;

    public ControlePergunta2() {
        frm = new FrmPergunta2();
        associarEventos();
    }

    public void associarEventos() {
        frm.jBtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharActionPerformed(evt);
            }
        });

        frm.jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });

        frm.jBtnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAvancarActionPerformed(evt);
            }
        });
    }

    public void executar() {
        frm.setVisible(true);
    }

    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta0 cp = new ControlePergunta0();
        cp.executar();
    }

    private void jBtnAvancarActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta3 cp = new ControlePergunta3();
        cp.executar();
    }

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta1 cp = new ControlePergunta1();
        cp.executar();
    }

}
