package frontend;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JPanel;
import javax.swing.JTextField;
import backend.Suma;
/**
 *
 * @author Cristal
 */
public class PanelText extends Panel{

    private final JTextField textEditable;
    private final EventoDocumentListener evento;

    public PanelText(Suma suma) {
        this.evento = new EventoDocumentListener(suma, this, index);
        textEditable = new JTextField(10);
        textEditable.getDocument().addDocumentListener(evento);
        add(textEditable);
    }

    public String getText() {
        return textEditable.getText();
    }

    @Override
    public void actualizar() {
        textEditable.setText(evento.getSuma().toString());
    }
}
