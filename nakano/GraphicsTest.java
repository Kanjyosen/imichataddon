package nakano;
//�铽���m�ۂ̂��ߓ������̃i���o�����O����l���o�����p�b�P�[�W�����g�p���Ă��܂��B�i���o�����O���ɊJ������Ă��܂��B
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
JButton button2 = new JButton("�{�^��", icon);
}

