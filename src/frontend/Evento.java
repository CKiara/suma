package frontend;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {

    private static List<Panel> panels = new ArrayList<>();
    private static int index = 0;

    public static void addPanel(Panel panel){
        panels.add(panel);
        panel.setIndex(index);
        index++;
    }

    protected void actualizar(int index) {
        panels.get(index).actualizar();
    }

    protected void actualizarTodos() {
        for (Panel panel: panels) {
            panel.actualizar();
        }
    }
}
