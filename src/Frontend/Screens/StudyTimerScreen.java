package Frontend.Screens;

import Backend.ButtonManager;
import Backend.TimeTracker;
import Frontend.UIManager.UI;

import javax.swing.*;
import java.awt.*;

public class StudyTimerScreen extends TimerScreen{
    private final UI ui;
    private final ButtonManager buttonM;
    private JPanel studyPanel;
    private final Font font = new Font("Bradley Hand ITC", Font.BOLD, 30);

    private final TimeTracker studyTimer;
    private final String[] Options = new String[] {
            "Start",
            "Pause",
            "Restart",
            "Get a break",
            "Stop",
            "Home"
    };


    public StudyTimerScreen(UI ui) {
        super();
        this.ui = ui;
        studyTimer = new TimeTracker(ui, 3000);
        buttonM = new ButtonManager(ui);
    }
    @Override
    public void show() {
        if (ui.isMainScreenShow()) return;
        assignStudyTimer();
        assignButton();
        ui.getContainer().add(studyPanel, "Center");
        ui.getContainer().revalidate();
        ui.getContainer().repaint();
    }

    @Override
    public void hide() {
        if (ui.isMainScreenShow()) return;
        studyPanel.setVisible(false);
    }

    private void assignStudyTimer() {
        studyPanel = ui.assignJPanel(ui.getWindowHeight());
        studyPanel.add(studyTimer.getTimeLabel(), "Center");
    }

    private void assignButton() {
        for (String name : Options) {
            JButton button = ui.assignJButton(name, buttonM.studyTimerActionListener(), font);
            studyPanel.add(button);
        }
        studyPanel.setLayout(new GridLayout(Options.length + 1, 1));
    }

    public TimeTracker getStudyTimer() {
        return studyTimer;
    }

    @Override
    public TimeTracker customTimeTracker() {
        return studyTimer;
    }

    @Override
    public JPanel customJPanel() {
        return studyPanel;
    }

    @Override
    public String toString() {
        return "Study Timer Screen";
    }
}
