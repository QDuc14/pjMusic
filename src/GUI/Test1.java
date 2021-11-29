package GUI;
import BLL.Songs;
import BLL.songInfomation;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Vector;
public class Test1 extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JTextField textField2;
    private JProgressBar progressBar1;
    private JButton playButton;
    private JButton nextButton;
    private JSlider slider1;
    private JTable table1;
    private JEditorPane editorPane1;

    public Test1(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
    }
    public static void main(String[] args){
        JFrame test1 = new Test1( "Play Song");
        test1.setVisible(true);
    }
}