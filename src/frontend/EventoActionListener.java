package frontend;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import backend.Suma;

/**
 *
 * @author Cristal
 */
public class EventoActionListener extends Evento implements ActionListener {

    private final Suma suma;
    private final int index;

    public EventoActionListener(Suma suma, int index) {
        this.suma = suma;
        this.index = index;
    }

    public Suma getSuma() {
        return suma;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            suma.incrementar();
            actualizarTodos();
    }
}
