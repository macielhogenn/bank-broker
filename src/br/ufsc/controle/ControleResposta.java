/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.controle;

import br.ufsc.visao.FrmResposta;

/**
 *
 * @author admin
 */
public class ControleResposta {
    
    FrmResposta frm;
    
    public ControleResposta(){
        frm = new FrmResposta();
        associarEventos();
    }
    
    public void associarEventos(){
        frm.jBtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharActionPerformed(evt);
            }
        });
        
        frm.jBtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReiniciarActionPerformed(evt);
            }
        });
    }
    
    public void executar(){
        frm.setVisible(true);
    }
    
    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {                                               
        System.exit(0);
    }                                     
    
    private void jBtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        frm.setVisible(false);        
        ControlePergunta0 cp = new ControlePergunta0();
        cp.executar();
    }                                     
}
