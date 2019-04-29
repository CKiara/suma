package frontend;

import backend.Suma;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EventoDocumentListener extends Evento implements DocumentListener {

    private final Suma suma;
    private final PanelText panelText;
    private int index;

    public EventoDocumentListener(Suma suma, PanelText panelText, int index) {
        this.suma = suma;
        this.panelText = panelText;
        this.index = index;
    }

    public Suma getSuma() {
        return suma;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        int valor = Integer.parseInt(panelText.getText());
        suma.setValor(valor);
        actualizar(index);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        String texto = panelText.getText();
        if(texto.isEmpty()) {
            suma.setValor(0);
        }
        else {
            int valor = Integer.parseInt(panelText.getText());
            suma.setValor(valor);
        }
        actualizar(index);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("");
    }
}
