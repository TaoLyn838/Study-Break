package Frontend.Screens;

import Backend.ButtonManager;
import Backend.RealTime;
import Frontend.UIManager.UI;
import javax.swing.*;
import java.awt.*;

public class MainScreen {
    private final UI ui;
    private JPanel mainPanel;
    private final Font font = new Font("Bradley Hand ITC", Font.BOLD, 30);
    private final ButtonManager mainButton;
    private final String[] buttonOptions = new String[] {
//            "Study",
//            "BreakTimer",
            "Timer",
            "Setting",
            "Quit"
    };

    public MainScreen(UI ui) {
        this.ui = ui;
        mainButton = new ButtonManager(ui);
    }

    public void show() {
        assignRealTimeLabel();
        assignButton();
        ui.getContainer().add(mainPanel, "Center");
        ui.getContainer().revalidate();
        ui.getContainer().repaint();
    }

    private void assignRealTimeLabel() {
        RealTime realTime = new RealTime(ui, true);
        mainPanel = ui.assignJPanel(ui.getWindowHeight());
        mainPanel.add(realTime.getRealTimeLabel(), "North");
    }

    private void assignButton() {
        for (String name : buttonOptions) {
            JButton button = ui.assignJButton(name, mainButton.MainActionListener(), font);
            mainPanel.add(button);
        }
        mainPanel.setLayout(new GridLayout(buttonOptions.length + 1, 1));
    }

    public void hide() {
        mainPanel.setVisible(false);
    }

    public boolean isShow() {
        return mainPanel.isVisible();
    }

    @Override
    public String toString() {
        return "Main Screen";
    }
}
