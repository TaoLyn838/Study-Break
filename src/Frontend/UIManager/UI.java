package Frontend.UIManager;

import Backend.CycleLinkList;
import Backend.SettingController;
import Frontend.Screens.*;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.LinkedList;

public class UI extends UIObject {

    private final JFrame window = assignWindow();
    private final Container container = assignContainer(window);

    private final SettingScreen settingScreen = new SettingScreen(this);
    private final MainScreen mainScreen = new MainScreen(this);
    private final TimerScreen studyTimerScreen = new StudyTimerScreen(this);
    private final TimerScreen breakTimerScreen = new BreakTimerScreen(this);
    private final CycleLinkList<TimerScreen> studyBreak = new CycleLinkList<>();

    public UI() {
        studyBreak.insert(studyTimerScreen);
        studyBreak.insert(breakTimerScreen);
        window.setVisible(true); // important!!!!
    }

    public TimerScreen currentScreen() {
        return studyBreak.getCurrentData();
    }

    public TimerScreen nextTimer() {
        return studyBreak.goNextData();
    }

    public void Quit() {
        window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));
    }

    public Container getContainer() {
        return container;
    }

    public SettingScreen getSettingScreen() {
        return settingScreen;
    }

    public MainScreen getMainScreen() {
        return mainScreen;
    }
    public TimerScreen getStudyTimerScreen() {
        return studyTimerScreen;
    }

    public TimerScreen getBreakTimerScreen() {
        return breakTimerScreen;
    }
    public boolean isMainScreenShow() {
        return mainScreen.isShow();
    }
}
