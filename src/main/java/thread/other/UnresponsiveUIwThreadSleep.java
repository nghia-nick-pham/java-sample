package thread.other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnresponsiveUIwThreadSleep extends JFrame {

    private boolean stop = false;
    private JTextField tfCount;
    private int count = 1;

    /** Constructor to setup the GUI components */
    public UnresponsiveUIwThreadSleep() {
        Container cp = getContentPane();
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
                // Create a new Thread to do the counting
                Thread t = new Thread() {
                    @Override
                    public void run() {  // override the run() for the running behaviors
                        for (int i = 0; i < 100000; ++i) {
                            if (stop) break;
                            tfCount.setText(count + "");
                            ++count;
                            // Suspend this thread via sleep() and yield control to other threads.
                            // Also provide the necessary delay.
                            try {
                                sleep(10);  // milliseconds
                            } catch (InterruptedException ex) {}
                        }
                    }
                };
                t.start();  // call back run()
            }
        });

        JButton btnStop = new JButton("Stop Counting");
        cp.add(btnStop);
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                stop = true;
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Counter");
        setSize(300, 120);
        setVisible(true);
    }

    /** The entry Main method */
    public static void main(String[] args) {
        // Run GUI codes in Event-Dispatching thread for thread safety
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UnresponsiveUIwThreadSleep();  // Let the constructor do the job
            }
        });
    }
}
