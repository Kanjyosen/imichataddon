package takadanobaba;
//�铽���m�ۂ̂��ߓ������̃i���o�����O����l���o�����p�b�P�[�W�����g�p���Ă��܂��B�i���o�����O���ɊJ������Ă��܂��B
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;

class GraphicsFrame extend Frame{
    public GraphicsFrame() {
	setSize(200, 200);
	addWindowListener(new MyWindowAdapter());
    }

ImageIcon icon = new ImageIcon(".src/quit.png");
JButton button1 = new JButton(icon);
JButton button2 = new JButton("�{�^��", icon);
}
