package Frontend.Screens;

import Backend.ButtonManager;
import Backend.TimeTracker;
import Frontend.UIManager.UI;

import javax.swing.*;
import java.awt.*;

public class BreakTimerScreen extends TimerScreen {
    private final UI ui;
    private final ButtonManager buttonM;
    private JPanel breakPanel;
    private final Font font = new Font("Bradley Hand ITC", Font.BOLD, 30);

    private final TimeTracker breakTimer;
    private final String[] Options = new String[] {
            "end Break",
            "Home"
    };

    public BreakTimerScreen (UI ui) {
        super();
        this.ui = ui;
        buttonM = new ButtonManager(ui);
        breakTimer = new TimeTracker(ui, 3000);
    }
    @Override
    public void show() {
        if (ui.isMainScreenShow()) return;
        assignBreakTimer();
        assignButton();
        ui.getContainer().add(breakPanel, "Center");
        ui.getContainer().revalidate();
        ui.getContainer().repaint();
    }

    @Override
    public void hide() {
        if (ui.isMainScreenShow()) return;
        breakPanel.setVisible(false);
    }

    private void assignBreakTimer() {
        breakPanel = ui.assignJPanel(ui.getWindowHeight());
        breakPanel.add(breakTimer.getTimeLabel(), "Center");
    }

    private void assignButton() {
        for (String name : Options) {
            JButton button = ui.assignJButton(name, buttonM.breakTimerActionListener(), font);
            breakPanel.add(button);
        }
        breakPanel.setLayout(new GridLayout(Options.length + 1, 1));
    }

    @Override
    public TimeTracker customTimeTracker() {
        return breakTimer;
    }

    @Override
    public JPanel customJPanel() {
        return breakPanel;
    }

    @Override
    public String toString() {
        return "Break Timer Screen";
    }
}
