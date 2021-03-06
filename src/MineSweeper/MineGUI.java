package MineSweeper;

import javax.swing.*;

public class MineGUI extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("파일");
    JMenuItem file_new = new JMenuItem("새 게임");
    JMenuItem file_end = new JMenuItem("종료");

    public MineGUI() {
        this.setJMenuBar(menuBar);
        menuBar.add(file);
        file.add(file_new);
        file.add(file_end);
        this.setSize(50 * 8, 50 * 8); // 50-지뢰한칸의 사이즈, 8-지뢰의 갯수
        this.setVisible(true);
    }
}

