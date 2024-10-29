package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nghiapv on 28/03/2017.
 */
public class Counter extends JFrame {
    private boolean stop = false;  // start or stop the counter
    private JTextField tfCount;
    private int count = 1;
    private JLabel Counter;

    public Counter(){
        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        cp.add(new JLabel("Counter"));
        tfCount = new JTextField(count + "", 10);
        tfCount.setEditable(false);
        cp.add(tfCount);

        JButton btnStart = new JButton("Start Counting");
        cp.add(btnStart);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                stop = false;
                for (int i = 0; i < 100000; ++i) {
                    if (stop) break;  // check if STOP button has been pushed,
                    //  which changes the stop flag to true
                    tfCount.setText(count + "");
                    ++count;
                }
            }
        });
        JButton btnStop = new JButton("Stop Counting");
        cp.add(btnStop);
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                stop = true;  // set the stop flag
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setSize(300, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI codes in Event-Dispatching thread for thread safety
        new Counter();
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new Counter();  // Let the constructor do the job
//            }
//        });
    }



}
