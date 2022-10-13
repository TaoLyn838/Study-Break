import Backend.CycleLinkList;
import Frontend.UIManager.UI;

import javax.swing.*;

public class Main_test {
//
//    static class Helper extends TimerTask
//    {
//        long time = 30000;
//        public static int i = 0;
//        public void run()
//        {
//            System.out.println("time left:" + time);
//            if (time < 0) {
//                System.out.println("Time over");
//            }
//            time--;
//        }
//    }

    static class Node<E> {
        E data;
        Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }


        public String toString() {
            return data.toString();
        }
    }

    public static void main(String[] args) {
        /*
        这个里面的方法和下面的study.rimTimer()；一样，但是可以正常倒计时。
        Timer timer = new Timer();
        TimerTask task = new Helper();
        timer.schedule(task, 0, 1000);
         */

        //有Bug， 倒计时进行的很慢，特别慢。
        //TimerManager study = new StudyTimer();
        //study.runTimer();


//////////////等下记得的开起
//        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }





        /*
        JFrame window = new JFrame();
        window.setSize(new Dimension(500, 500));
        window.setMinimumSize(new Dimension(400,400));
        window.setMaximumSize(new Dimension(800,800));
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.white);
        window.setVisible(true);




        Container container = window.getContentPane();
        container.setLayout(new BorderLayout());
        /*
        JLabel label = new JLabel();
        label.setText("Example");
        label.setForeground(Color.white);
        container.add(label, "Center");


        JButton button = new JButton();
        button.setText("MyButton");
        button.setForeground(Color.black);
        container.add(button, "Center");

        UI ui = new UI();
        ChoiceController choiceController = new ChoiceController();
        ChoiceController.Handler handler = choiceController.getHandler();

        JButton userDefinedButton = ui.assignJButton("Defined Button", "Press", handler);
        JButton settingButton = ui.assignJButton("Setting", handler);
        container.add(settingButton, "North");
        //userDefinedButton.addActionListener(handler);
        //userDefinedButton.setForeground(Color.);
        //userDefinedButton.setBounds(0, 0, 200, 50);
        //userDefinedButton.setContentAreaFilled(false);
        container.add(userDefinedButton, "South");


        TimeTracker timeTracker = new TimeTracker(ui);
        JLabel timeLabel = timeTracker.getTimeLabel();
        timeLabel.setForeground(Color.cyan);
        container.add(timeLabel, "West");

        container.revalidate();
        container.repaint();

 */
//        CycleLinkList<Integer> list = new CycleLinkList<>();
//        list.insert(3);
//        list.insert(2);
//        list.insert(1);
//        Node<Integer> head = new Node<>(1, new Node<>(2, new Node(3, null)));
//        Node last = head;
//        last = last.next.next;
//        last.next = head;
//        head = head.next;
//        head = head.next;
//        head = head.next;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(head);
//            head = head.next;
//        }

//        Node node = new Node<> (3, new Node<> (4, new Node<>(5, null)));
//
//        int i = 3;
//        Node current = node;
//        while (i - 1 > 0) {
//            System.out.println(current);
//            current = current.next;
//            i--;
//        }
//        current.next = new Node<>(6, null);
//        int j = 4;
//        while (j > 0) {
//            System.out.println(node);
//            node = node.next;
//            j--;
//        }

        UI ui = new UI();
        ui.getMainScreen().show();
    }

}
