package Backend;

import Frontend.UIManager.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreenController {
    private final UI ui;
    private final MainScreenButtonHandler mainScreenButtonHandler = new MainScreenButtonHandler();

    public MainScreenController(UI ui) {
        this.ui = ui;
    }

    protected class MainScreenButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Quit":
                    ui.Quit();
                    break;
//                case "BreakTimer" :
//                    ui.getMainScreen().hide();
//                    ui.getBreakTimerScreen().show();
//                    break;
                case "Setting":
                    ui.getMainScreen().hide();
                    ui.getSettingScreen().show();
                    break;
//                case "Study":
//                    ui.getMainScreen().hide();
//                    ui.getStudyTimerScreen().show();
//                    break;
                case "Timer":
                    ui.getMainScreen().hide();
                    ui.currentScreen().show();
            }
        }
    }

    public MainScreenButtonHandler getMainScreenButtonHandler() {
        return mainScreenButtonHandler;
    }
}
