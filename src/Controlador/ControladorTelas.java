/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import view.TelaInicial;
import view.TelaXurupizzas;


/**
 *
 * @author Discentes
 */
public class ControladorTelas {
    public ControladorTelas(JDesktopPane jDesktopPane1){
        this.jDesktopPane = jDesktopPane1;
    }
    JDesktopPane jDesktopPane;
    
    public void AbrirTelaXurpizzas(){
        jDesktopPane.removeAll();
        jDesktopPane.updateUI();
        Dimension tamanho = jDesktopPane.getSize();
        TelaXurupizzas t1 = new TelaXurupizzas();
        t1.setSize(tamanho);
        t1.setLocation(0, 0);
        jDesktopPane.add(t1);
        t1.setVisible(true);
    }
}