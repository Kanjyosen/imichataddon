package takadanobaba;
//秘匿性確保のため東西線のナンバリングから考え出したパッケージ名を使用しています。ナンバリング順に開発されています。
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
JButton button2 = new JButton("ボタン", icon);
}
