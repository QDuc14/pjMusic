package GUI;
import javax.swing.*;

public class FORM1 extends JFrame{
    private JPanel mainField;
    private JTextField txtSearch;
    private JButton play;
    private JEditorPane listRecommend;
    private JEditorPane txtLyrics;
    private JEditorPane editorPane3;
    private JButton btnSearch;
    private JButton Artist;

    public FORM1(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainField);
        this.pack();
    }
    public static void main(String[] args){
        JFrame frame = new FORM1( "Play Song");
        frame.setVisible(true);
    }
}
