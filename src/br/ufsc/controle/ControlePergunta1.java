/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.controle;

import br.ufsc.visao.FrmPergunta1;

/**
 *
 * @author admin
 */
public class ControlePergunta1 {

    FrmPergunta1 frm;

    public ControlePergunta1() {
        frm = new FrmPergunta1();
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

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta0 cp = new ControlePergunta0();
        cp.executar();
    }

    private void jBtnAvancarActionPerformed(java.awt.event.ActionEvent evt) {
        frm.setVisible(false);
        ControlePergunta2 cp = new ControlePergunta2();
        cp.executar();
    }
}
