package MineSweeper;

import javax.swing.*;
import java.awt.*;

public class MineGUI extends JFrame {


    public  JFrame createFrame() {

        JFrame frame = new JFrame("MineSweeper");
        //frame.setLocation(200, 400);
        frame.setPreferredSize(new Dimension(400, 150));

        frame.setJMenuBar((JMenuBar) createMenuBar());
        frame.add(printState());
        frame.add(makeButton());
        frame.pack();
        frame.setVisible(true);
        return frame;
    }

    public Component createMenuBar() {

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("파일");
        JMenuItem file_new = new JMenuItem("새 게임");
        JMenuItem file_end = new JMenuItem("종료");

        menuBar.add(file);
        file.add(file_new);
        file.add(file_end);

        return menuBar;
    }

    public JPanel printState() { // 남은지뢰수 등등 표시하는 칸
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.add(new JLabel("TEST"));

        return panel;
    }

    public JPanel makeButton() { // 지뢰찾을 버튼 만들기
        JPanel panel = new JPanel();
        GridLayout grid = new GridLayout(8, 8);
        setLayout(grid);
        JButton[][] button = new JButton[8][8];

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                button[i][j] = new JButton();
                panel.add(button[i][j]);
                //add(button[i][j]);
            }
        }

        return panel;
    }
}

