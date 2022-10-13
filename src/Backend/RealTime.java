package Backend;

import Frontend.UIManager.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RealTime {
    private final Timer realTime;
    private final JLabel realTimeLabel;

    public RealTime (UI ui, boolean visible) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        final String[] time = {timeFormat.format(new Date())};
        final String[] day = {dayFormat.format(new Date())};
        final String[] date = {dateFormat.format(new Date())};

        realTimeLabel = ui.assignJLabel("", 25);
        realTimeLabel.setText(time[0] + ":" + day[0] + ":" + date[0]);
        realTime = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (visible) {
                    time[0] = timeFormat.format(new Date());
                    day[0] = dayFormat.format(new Date());
                    date[0] = dateFormat.format(new Date());
//                    realTimeLabel.setText(day[0] + "\t" + time[0] + "\t" + date[0]);
                    realTimeLabel.setText(time[0] + ":" + day[0] + ":" + date[0]);
                }
            }
        });
        start();
    }

    void start() {realTime.start();}
    public JLabel getRealTimeLabel () {return realTimeLabel;}

}

