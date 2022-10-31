package Backend;

import Frontend.Screens.BreakTimerScreen;
import Frontend.Screens.StudyTimerScreen;
import Frontend.Screens.TimerScreen;
import Frontend.UIManager.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeTracker {

    private final JLabel timeLabel; //
    // private JLabel time
    private int elapsedTime = 0;
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private String seconds_string;
    private String minutes_string;
    private String hours_string;
    private boolean toNext = false;

    private final Timer timer;

    //private final Timer conDownTimer;

    public TimeTracker(UI ui) {
        timeLabel = ui.assignJLabel("", 35);
        timeLabel.setText("00:00:00");
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //int ref = modeSetting.getInterval()*60000;
                //if (elapsedTime/ref > 0 && elapsedTime % ref == 0) {
                //    sound.play(modeSetting.getVolume());
                //}
                elapsedTime += 1000;
                hours = (elapsedTime / 3600000);
                minutes = (elapsedTime / 60000) % 60;
                seconds = (elapsedTime / 1000) % 60;
                seconds_string = String.format("%02d", seconds);
                minutes_string = String.format("%02d", minutes);
                hours_string = String.format("%02d", hours);
                timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
            }
        });
    }

    public TimeTracker(UI ui, int alarm) {
        timeLabel = ui.assignJLabel("", 35);
        timeLabel.setText("00:00:00");
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //int ref = modeSetting.getInterval()*60000;
                //if (elapsedTime/ref > 0 && elapsedTime % ref == 0) {
                //    sound.play(modeSetting.getVolume());
                //}
                elapsedTime += 1000;
                hours = (elapsedTime / 3600000);
                minutes = (elapsedTime / 60000) % 60;
                seconds = (elapsedTime / 1000) % 60;
                seconds_string = String.format("%02d", seconds);
                minutes_string = String.format("%02d", minutes);
                hours_string = String.format("%02d", hours);
                if (elapsedTime >= alarm) {
                    ui.currentScreen().end();
                    ui.currentScreen().hide();
                    ui.nextTimer().show();
                    ui.currentScreen().start();
                }
                timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
            }
        });
    }

    public void start() {
        timer.start();
        toNext = false;
    }

    public void reset() {
        pause();
        elapsedTime = 0;
        timeLabel.setText("00:00:00");
    }

    public void pause() {
        if (!timer.isRunning()) return;
        timer.stop();
    }

    public void end() {
        timeLabel.setText("00:00:00");
        elapsedTime = 0;
        pause();
    }

    public void clear() {
        if (!timer.isRunning() && elapsedTime == 0) {
            return;
        }
        reset();
        timer.start();
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }
}

