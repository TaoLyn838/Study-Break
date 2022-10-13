package Frontend.Screens;

import Backend.ButtonManager;
import Frontend.UIManager.UI;

import javax.swing.*;
import java.awt.*;

public class SettingScreen {

    private final Font font = new Font("Bradley Hand ITC", Font.BOLD, 30);
    private final UI ui;
    private JPanel settingPanel;

    private ButtonManager settingButton;

    private final String[] settingsOptions = new String[] {
            "StudyTimer",
            "BreakTimer",
            "Sound",
            "Back"
    };

    public SettingScreen(UI ui) {
        this.ui = ui;
        settingButton = new ButtonManager(ui);
    }

    public SettingScreen (UI ui, int height, int width) {this.ui = ui;}

    public void show() {
        assignSettingPanel();
        ui.getContainer().add(settingPanel, "Center");
        ui.getContainer().revalidate();
        ui.getContainer().repaint();
    }
    private void assignSettingPanel () {
        settingPanel = ui.assignJPanel(ui.getWindowHeight());
        JLabel title = ui.assignJLabel("Setting", new Font("Bradley Hand ITC", Font.BOLD, 60));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        settingPanel.add(title);

        for (String name : settingsOptions) {
            JButton button = ui.assignJButton(name, settingButton.settingActionListener(), font);
            settingPanel.add(button);
        }
        settingPanel.setLayout(new GridLayout(settingsOptions.length + 1, 1));
    }

    public void hide() {
        settingPanel.setVisible(false);
    }

    @Override
    public String toString() {
        return "Setting Screen";
    }
}
