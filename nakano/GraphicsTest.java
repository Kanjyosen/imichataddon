package nakano;
//秘匿性確保のため東西線のナンバリングから考え出したパッケージ名を使用しています。ナンバリング順に開発されています。
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class GraphicsFrame extends Frame {
    public GraphicsFrame() {
	setSize(200, 200);
	addWindowListener(new MyWindowAdapter());
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
	System.exit(0);
    };
ImageIcon icon = new ImageIcon(".src/nakano/quit.png");
JButton button1 = new JButton(icon);
JButton button2 = new JButton("ボタン", icon);
}

