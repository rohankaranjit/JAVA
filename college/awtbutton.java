import java.awt.*;
import java.awt.event.*;

public class App extends Frame {

    App() {
        // Adding a new Button
        Button btn = new Button("Hello World");
        add(btn);

        // Setting frame properties
        setSize(400, 500);
        setTitle("StudyTonight");
        setLayout(new FlowLayout()); // Set default layout for the frame
        setVisible(true); // Set frame visibility to true

        // Optional: Close the frame when the button is clicked
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new App();
    }
}
