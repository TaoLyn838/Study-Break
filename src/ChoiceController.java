import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceController {

    private final Handler handler = new Handler();

    public ChoiceController() {

    }

    public class Handler implements ActionListener {

        public Handler() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Press":
                    System.out.println("You pressed the button.");
                    break;
                case "Setting":
                    System.out.println("into setting");
                    break;
                default:
                    break;
            }
        }
    }

    public Handler getHandler() {
        return handler;
    }
}
