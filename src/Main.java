/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import backend.Suma;
import frontend.*;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Cristal
 */
public class Main extends Container {

    private Suma suma;
    private EventoActionListener eventoActionListener;
    private EventoDocumentListener eventoDocumentListener;
    private PanelIncremento panelIncremento;
    private PanelText panelText;
    private JFrame frame;

    public Main() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 300));
        initComponent();
    }
    
    private void initComponent() {
        suma = new Suma();
        panelIncremento = new PanelIncremento(suma);
        panelText = new PanelText(suma);
        Evento.addPanel(panelIncremento);
        Evento.addPanel(panelText);
        add(panelText, BorderLayout.LINE_START);
        add(panelIncremento, BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Suma");
            frame.setContentPane(new Main());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    
}

