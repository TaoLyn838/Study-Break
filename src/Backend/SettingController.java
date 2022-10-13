package Backend;

import Frontend.UIManager.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingController {

    private final SettingHandler settingHandler = new SettingHandler();
    private final UI ui;


    public SettingController (UI ui) {
        this.ui = ui;
    }


    protected class SettingHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "StudyTimer":
                    break;
                case "BreakTimer":
                    break;
                case "Sound":
                    break;
                case "Back":
                    ui.getSettingScreen().hide();
                    ui.getMainScreen().show();
                    break;
                default:
                    break;
            }
        }
    }

    public SettingHandler getSettingHandler() {
        return settingHandler;
    }
}
