/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.controle;

import br.ufsc.visao.FrmPergunta3;

/**
 *
 * @author admin
 */
public class ControlePergunta3 {

    FrmPergunta3 frm;

    public ControlePergunta3() {
        frm = new FrmPergunta3();
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
    }

    public void executar() {
        frm.setVisible(true);
    }

    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta0 cp = new ControlePergunta0();
        cp.executar();
    }

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta2 cp = new ControlePergunta2();
        cp.executar();
    }
}
