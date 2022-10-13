package Frontend.Screens;

import Backend.TimeTracker;

import javax.swing.*;

public abstract class TimerScreen {
    public TimerScreen() {
    }

    public abstract TimeTracker customTimeTracker();
    public abstract JPanel customJPanel();
    public abstract void show();
    public abstract void hide();
    public void start() {
        customTimeTracker().start();
    }

    public void end() {
        customTimeTracker().end();
    }
    public void pause() {
        customTimeTracker().pause();
    }
    public void stop() {
        customTimeTracker().reset();
    }
    public void restart() {
        customTimeTracker().clear();
    }
}
