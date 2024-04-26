package GeekBrains.Swing;

import javax.swing.*;
import java.awt.*;

public class AppForms {
    static class AppForm extends JFrame {


        public AppForm() {
            setTitle("Крестики-нолики");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setSize(400,400);
            //getContentPane().setBackground(Color.BLUE);
            setLayout(new GridLayout(3,3,10, 10)); // назначение кнопок в центре таблицей
            JButton[] button = new JButton[9]; // создание массива объектов button
            for (int i = 0; i < button.length; i++) { //проход циклом
            button[i] = new JButton("."); //инициализация кнопки названием (об-т button конструктор String txt)
            add(button[i]);

            }

            /*add(button[0]);
            add(button[1]);
            add(button[2]);
            add(button[3]);
            add(button[4]);
            add("x",button[5]);
            add(button[6]);
            add(button[7]);
            add(button[8]);*/
            setVisible(true);
        }
    }

}
