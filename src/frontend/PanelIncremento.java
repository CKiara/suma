package frontend;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import backend.Suma;
/**
 *
 * @author Cristal
 */
public class PanelIncremento extends Panel{

    private static final String TITULO = "+";
    private final JTextField textNoEditable;
    private final JButton button;
    private final EventoActionListener eventoActionListener;

    public PanelIncremento(Suma suma) {
        this.eventoActionListener = new EventoActionListener(suma, index);
        textNoEditable = new JTextField(10);
        textNoEditable.setEditable(false);
        add(textNoEditable);
        
        button = new JButton(TITULO);
        button.addActionListener(eventoActionListener);
        add(button);
    }

    @Override
    public void actualizar() {
        textNoEditable.setText(eventoActionListener.getSuma().toString());
    }
}
