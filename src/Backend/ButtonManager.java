package Backend;

import Frontend.UIManager.UI;

public class ButtonManager {

    private final SettingController settingController;
    private final MainScreenController mainScreenController;
    private final StudyTimerController studyTimerController;

    private final BreakTimerController breakTimerController;

    public ButtonManager (UI ui) {
        settingController =  new SettingController(ui);
        mainScreenController =  new MainScreenController(ui);
        studyTimerController = new StudyTimerController(ui);
        breakTimerController = new BreakTimerController(ui);
    }

    public SettingController.SettingHandler settingActionListener() {return settingController.getSettingHandler();}

    public MainScreenController.MainScreenButtonHandler MainActionListener() {
        return mainScreenController.getMainScreenButtonHandler();
    }

    public StudyTimerController.StudyTimerHandler studyTimerActionListener() {
        return studyTimerController.getStudyTimerHandler();
    }

    public BreakTimerController.BreakTimerHandler breakTimerActionListener() {
        return breakTimerController.getBreakTimerHandler();
    }
}
