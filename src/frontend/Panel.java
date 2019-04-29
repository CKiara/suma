package frontend;

import javax.swing.JPanel;

public abstract class Panel extends JPanel {

    protected int index;

    protected void setIndex(int index) {
        this.index = index;
    }

    abstract void actualizar();

}
