package Backend;

import Frontend.UIManager.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BreakTimerController {
    private final UI ui;
    private final BreakTimerHandler breakTimerHandler = new BreakTimerHandler();

    public BreakTimerController (UI ui) {
        this.ui = ui;
    }

    protected class BreakTimerHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "end Break" -> {
                    ui.getBreakTimerScreen().hide();
                    ui.getStudyTimerScreen().show();
                    ui.getBreakTimerScreen().stop();
                }
                case "Home" -> {
                    ui.getBreakTimerScreen().hide();
                    ui.getMainScreen().show();
                }
            }
        }
    }

    public BreakTimerHandler getBreakTimerHandler() {
        return breakTimerHandler;
    }
}
