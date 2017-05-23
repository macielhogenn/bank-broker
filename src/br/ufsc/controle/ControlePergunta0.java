/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.controle;

import br.ufsc.visao.FrmPergunta0;

/**
 *
 * @author admin
 */
public class ControlePergunta0 {
    
    FrmPergunta0 frm;
    
    public ControlePergunta0(){
        frm = new FrmPergunta0();
        associarEventos();
    }
    
    public void associarEventos(){
        frm.jBtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFecharActionPerformed(evt);
            }
        });
        
        frm.jBtnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAvancarActionPerformed(evt);
            }
        });
    }
    
    public void executar(){
        frm.setVisible(true);
    }
    
    private void jBtnFecharActionPerformed(java.awt.event.ActionEvent evt) {                                               
        System.exit(0);
    }                                     
    
    private void jBtnAvancarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        frm.setVisible(false);        
        ControlePergunta1 cp = new ControlePergunta1();
        cp.executar();
    }                                     
}
