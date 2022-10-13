package Backend;

import Frontend.UIManager.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudyTimerController {
    private final UI ui;

    public StudyTimerController(UI ui) {
        this.ui = ui;
    }

    private final StudyTimerHandler studyTimerHandler = new StudyTimerHandler();

    protected class StudyTimerHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Start" -> {
                    ui.getStudyTimerScreen().start();
//                    if (ui.getStudyTimerScreen().getStudyTimer().getToNext()) {
//                        ui.getStudyTimerScreen().stop();
//                        ui.getStudyTimerScreen().hide();
//                        ui.getBreakTimerScreen().show();
//                        ui.getBreakTimerScreen().start();
//                    }
                }
                case "Pause" -> ui.getStudyTimerScreen().pause();
                case "Restart" -> ui.getStudyTimerScreen().restart();
                case "Stop" -> ui.getStudyTimerScreen().stop();
                case "Get a break" -> {
                    ui.getStudyTimerScreen().hide();
                    ui.getBreakTimerScreen().show();
                    ui.getBreakTimerScreen().start();
                }
                case "Home" -> {
                    ui.getStudyTimerScreen().hide();
                    ui.getMainScreen().show();
                }
            }
        }
    }



    public StudyTimerHandler getStudyTimerHandler() {
        return studyTimerHandler;
    }

}